package flyingagency.oar.objected.flyingagency.repository;

import flyingagency.oar.objected.flyingagency.model.Flight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface FlightRepository extends CrudRepository<Flight, String> {

    Iterable<Flight> findAllByDepartureTimeLessThanEqualAndLandingTimeGreaterThanEqual(Date departureTime, Date landingTime);
}
