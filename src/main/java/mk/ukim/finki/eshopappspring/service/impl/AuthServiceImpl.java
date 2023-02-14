package mk.ukim.finki.eshopappspring.service.impl;

import mk.ukim.finki.eshopappspring.exceptions.InvalidArgumentsException;
import mk.ukim.finki.eshopappspring.exceptions.InvalidUserCredentialException;
import mk.ukim.finki.eshopappspring.exceptions.PasswordsDoNotMatchException;
import mk.ukim.finki.eshopappspring.exceptions.UsernameAlreadyExistsException;
import mk.ukim.finki.eshopappspring.model.User;
import mk.ukim.finki.eshopappspring.repository.jpa.UserRepository;
import mk.ukim.finki.eshopappspring.service.AuthService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User login(String username, String password) {
        if (username==null || username.isEmpty() || password==null || password.isEmpty()) {
            throw new InvalidArgumentsException();
        }
        return userRepository.findByUsernameAndPassword(username,
                password).orElseThrow(InvalidUserCredentialException::new);
    }

    @Override
    public User register(String username, String password, String repeatPassword, String name, String surname) {
        if (username==null || username.isEmpty()  || password==null || password.isEmpty())
            throw new InvalidArgumentsException();

        if (!password.equals(repeatPassword))
            throw new PasswordsDoNotMatchException();

        if(this.userRepository.findByUsername(username).isPresent()
                || !this.userRepository.findByUsername(username).isEmpty())
            throw new UsernameAlreadyExistsException(username);

        User user = new User(username,password,name,surname);
        return userRepository.save(user);
    }
}
