package flyingagency.oar.objected.flyingagency.repository;


import flyingagency.oar.objected.flyingagency.model.AirPlaneEquipment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaneEquipmentRepository extends CrudRepository<AirPlaneEquipment, String> {
}
