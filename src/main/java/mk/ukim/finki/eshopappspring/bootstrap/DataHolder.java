package mk.ukim.finki.eshopappspring.bootstrap;

import mk.ukim.finki.eshopappspring.model.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

    public static List<Category> categories = new ArrayList<>();
    public static List<User> users = new ArrayList<>();
    public static List<Product> products = new ArrayList<>();
    public static List<Manufacturer> manufacturers = new ArrayList<>();
    public static List<ShoppingCart> shoppingCarts = new ArrayList<>();

//    @PostConstruct
//    public void init() {
//
//        users.add(new User("vojdan.stefkovski", "pass", "Vojdan", "Stefkovski"));
//        users.add(new User("kiko.vojceski", "pass", "Kiko", "Vojceski"));
//
//        Category category = new Category("Sport", "Sports category");
//        categories.add(category);
//
//        Manufacturer manufacturer = new Manufacturer("Nike", "NY NY");
//        manufacturers.add(manufacturer);
//        manufacturers.add(new Manufacturer("Apple", "LA LA"));
//
//        products.add(new Product("Ball", 350.0, 3, category, manufacturer));
//        products.add(new Product("Harry Potter", 500.0, 3, category, manufacturer));
//
//    }
}
