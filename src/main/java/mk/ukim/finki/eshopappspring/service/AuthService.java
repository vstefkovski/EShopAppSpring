package mk.ukim.finki.eshopappspring.service;

import mk.ukim.finki.eshopappspring.model.User;

import java.util.Optional;

public interface AuthService {

    User login(String username, String password) throws Throwable;

    User register(String username, String password, String repeatPassword, String name, String surname);

}
