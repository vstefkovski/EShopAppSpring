package mk.ukim.finki.eshopappspring.service.impl;

import mk.ukim.finki.eshopappspring.exceptions.InvalidArgumentsException;
import mk.ukim.finki.eshopappspring.exceptions.InvalidUserCredentialException;
import mk.ukim.finki.eshopappspring.exceptions.PasswordsDoNotMatchException;
import mk.ukim.finki.eshopappspring.model.User;
import mk.ukim.finki.eshopappspring.repository.InMemoryUserRepository;
import mk.ukim.finki.eshopappspring.service.AuthService;
import org.springframework.stereotype.Service;

import java.util.function.Supplier;

@Service
public class AuthServiceImpl implements AuthService {

    private final InMemoryUserRepository userRepository;

    public AuthServiceImpl(InMemoryUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User login(String username, String password) throws Throwable {
        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
            throw new InvalidArgumentsException();
        }
        return userRepository.findByUsernameAndPassword(username, password).orElseThrow(InvalidUserCredentialException::new);
    }

    @Override
    public User register(String username, String password, String repeatPassword, String name, String surname) {
        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
            throw new InvalidArgumentsException();
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordsDoNotMatchException();
        }
        User user = new User(username, password, name, surname);
        return userRepository.saveOrUpdate(user);
    }
}
