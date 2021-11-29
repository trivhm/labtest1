package rmit.rmitsb.contrller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rmit.rmitsb.model.Category;
import rmit.rmitsb.model.Product;
import rmit.rmitsb.service.CategoryService;
import rmit.rmitsb.service.ProductService;

import java.util.List;

@RestController
@CrossOrigin
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(path = "/products", method = RequestMethod.GET)
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @RequestMapping(path = "/products", method = RequestMethod.POST)
    public void addProduct(@RequestBody Product student){
        productService.saveProduct(student);
    }

    @RequestMapping(path = "/products/{id}", method = RequestMethod.POST)
    public void addOneProduct(@RequestBody Product student, @PathVariable Long id){
        Category cat = categoryService.getCategory(id);
        //System.out.println(id);
        //System.out.println("This is cat");
        //System.out.println(cat.getId());
        student.setCategory(cat);
        //System.out.println(student.getCategory().getDescription());
        productService.saveProduct(student);
    }

    @RequestMapping(path = "/products", method = RequestMethod.PUT)
    public void updateProduct(@RequestBody Product student){
        productService.saveProduct(student);
    }

    @RequestMapping(path = "/products/{id}", method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable(value = "id") Long id){
        productService.deleteProduct(id);
    }

    @RequestMapping(path = "/products/{id}", method = RequestMethod.GET)
    public Product getProduct(@PathVariable(value = "id") Long id){
        return productService.getProduct(id);
    }
}
