package flyingagency.oar.objected.flyingagency.repository;


import flyingagency.oar.objected.flyingagency.model.AirPlaneSpecs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaneSpecsRepository extends CrudRepository<AirPlaneSpecs, String> {
}
