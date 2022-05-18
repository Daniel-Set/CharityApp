package pl.setlikd.charity.institution;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public interface InstitutionRepository extends CrudRepository<Institution, Long> {
}

