package flyingagency.oar.objected.flyingagency.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document
public class AirPlane implements Serializable {

    @Id
    private String id;

    private Brand brand;

    private AirPlaneEquipment airPlaneEquipment;
    private AirPlaneSpecs airPlaneSpecs;
}
