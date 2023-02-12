package mk.ukim.finki.eshopappspring.service;

import mk.ukim.finki.eshopappspring.model.Product;
import mk.ukim.finki.eshopappspring.model.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {

    List<Product> listAllProductsInShoppingCart(Long cartId);

    ShoppingCart getActiveShoppingCart(String username);

    ShoppingCart addProductToShoppingCart(String username, Long productId);
}
