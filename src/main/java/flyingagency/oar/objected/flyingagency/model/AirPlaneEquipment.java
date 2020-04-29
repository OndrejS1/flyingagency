package flyingagency.oar.objected.flyingagency.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document
public class AirPlaneEquipment implements Serializable {

    private int economySeatNumber;
    private int businessSeatNumber;
    private int amountOfExits;
    private int amountOfBars;

}
