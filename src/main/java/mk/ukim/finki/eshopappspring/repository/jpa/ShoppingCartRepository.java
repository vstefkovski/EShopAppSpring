package mk.ukim.finki.eshopappspring.repository.jpa;

import mk.ukim.finki.eshopappspring.enumeration.ShoppingCartStatus;
import mk.ukim.finki.eshopappspring.model.ShoppingCart;
import mk.ukim.finki.eshopappspring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
    Optional<ShoppingCart> findByUserAndStatus(User user, ShoppingCartStatus status);
}
