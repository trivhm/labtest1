package rmit.rmitsb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rmit.rmitsb.model.Category;
import rmit.rmitsb.model.Student;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
