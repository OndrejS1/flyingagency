package flyingagency.oar.objected.flyingagency.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document
public class AirPlaneSpecs implements Serializable {

    private Double cabinLength;
    private Double overallLength;
    private Double range;
    private Double height;
    private Double track;
    private Double wheelBase;

}
