package rmit.rmitsb.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rmit.rmitsb.model.Category;
import rmit.rmitsb.model.Student;
import rmit.rmitsb.repository.CategoryRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryRepository categoryRepository;


    public void saveCategory(Category category){
        this.categoryRepository.save(category);
    }

    public List<Category> getAllCategories(){
        return this.categoryRepository.findAll();
    }

    public Category getCategory(Long id){
        Category category = null;
        try {
            category = this.categoryRepository.findById(id)
                    .orElseThrow(() -> new Exception("Student not found for this id :: " + id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return category;
    }

    public Category deleteCategory(Long id){

        Category category = getCategory(id);
        this.categoryRepository.delete(category);
        return category;
    }
}
