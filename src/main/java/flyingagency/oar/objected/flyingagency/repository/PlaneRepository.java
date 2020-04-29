package flyingagency.oar.objected.flyingagency.repository;

import flyingagency.oar.objected.flyingagency.model.AirPlane;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaneRepository extends CrudRepository<AirPlane, String> {

   //  Iterable<Plane> findAllByStartDateLessThanEqualAndEndDateGreaterThanEqual(Date startDate, Date endDate);

}
