package mk.ukim.finki.eshopappspring.bootstrap;

import mk.ukim.finki.eshopappspring.model.Category;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

    public static List<Category> categories = new ArrayList<>();

    @PostConstruct
    public void init() {
        categories.add(new Category("Book", "Book category"));
        categories.add(new Category("Movies", "Movies category"));
    }
}
