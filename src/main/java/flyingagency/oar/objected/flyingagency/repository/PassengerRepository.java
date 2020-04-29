package flyingagency.oar.objected.flyingagency.repository;

import flyingagency.oar.objected.flyingagency.model.Passenger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends CrudRepository<Passenger, String> {

}
