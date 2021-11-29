package rmit.rmitsb.service;

import rmit.rmitsb.model.Category;
import rmit.rmitsb.model.Student;

import java.util.List;

public interface CategoryService {

    public void saveCategory(Category category);

    public List<Category> getAllCategories();
    public Category getCategory(Long id);

    public Category deleteCategory(Long id);
}
