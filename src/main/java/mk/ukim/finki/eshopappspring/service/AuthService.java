package mk.ukim.finki.eshopappspring.service;

import mk.ukim.finki.eshopappspring.model.User;

import java.util.Optional;

public interface AuthService {

    User login(String username, String password);


}
