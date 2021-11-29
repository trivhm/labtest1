package rmit.rmitsb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rmit.rmitsb.model.Category;
import rmit.rmitsb.model.Product;
import rmit.rmitsb.repository.CategoryRepository;
import rmit.rmitsb.repository.ProductRepository;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    public void saveProduct(Product product){
        this.productRepository.save(product);
    }

    public List<Product> getAllProducts(){
        return this.productRepository.findAll();
    }

    public Product getProduct(Long id){
        Product product = null;
        try {
            product = this.productRepository.findById(id)
                    .orElseThrow(() -> new Exception("Student not found for this id :: " + id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }

    public Product deleteProduct(Long id){

        Product product = getProduct(id);
        this.productRepository.delete(product);
        return product;
    }
}
