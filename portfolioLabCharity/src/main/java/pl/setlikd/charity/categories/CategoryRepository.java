package pl.setlikd.charity.categories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
