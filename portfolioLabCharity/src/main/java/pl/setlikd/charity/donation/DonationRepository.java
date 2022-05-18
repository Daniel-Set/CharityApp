package pl.setlikd.charity.donation;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public interface DonationRepository extends CrudRepository<Donation, Long> {


}
