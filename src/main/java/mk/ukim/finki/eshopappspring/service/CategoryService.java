package mk.ukim.finki.eshopappspring.service;

import mk.ukim.finki.eshopappspring.model.Category;

import java.util.List;

public interface CategoryService {

    Category create(String name, String description);

    Category update(String name, String description);

    void delete(String name);

    List<Category> listCategories();

    List<Category> searchCategories(String searchText);

}

