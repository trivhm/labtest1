package rmit.rmitsb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rmit.rmitsb.model.Category;
import rmit.rmitsb.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
