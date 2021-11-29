package rmit.rmitsb.contrller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rmit.rmitsb.model.Category;
import rmit.rmitsb.model.Student;
import rmit.rmitsb.service.CategoryService;
import rmit.rmitsb.service.StudentService;

import java.util.List;

@RestController
@CrossOrigin
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(path = "/categories", method = RequestMethod.GET)
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @RequestMapping(path = "/categories", method = RequestMethod.POST)
    public void addCategory(@RequestBody Category student){
        categoryService.saveCategory(student);
    }

    @RequestMapping(path = "/categories", method = RequestMethod.PUT)
    public void updateCategory(@RequestBody Category student){
        categoryService.saveCategory(student);
    }

    @RequestMapping(path = "/categories/{id}", method = RequestMethod.DELETE)
    public void deleteCategory(@PathVariable(value = "id") Long id){
        categoryService.deleteCategory(id);
    }

    @RequestMapping(path = "/categories/{id}", method = RequestMethod.GET)
    public Category getCategory(@PathVariable(value = "id") Long id){
        return categoryService.getCategory(id);
    }
}
