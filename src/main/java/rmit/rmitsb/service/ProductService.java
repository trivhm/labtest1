package rmit.rmitsb.service;

import rmit.rmitsb.model.Product;
import rmit.rmitsb.model.Student;

import java.util.List;

public interface ProductService {


    public void saveProduct(Product student);

    public List<Product> getAllProducts();
    public Product getProduct(Long id);

    public Product deleteProduct(Long id);


}
