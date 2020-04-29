package flyingagency.oar.objected.flyingagency.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;


@Data
@Document
public class Flight implements Serializable {

    @Id
    private String flightId;

    @Indexed
    private String planeId;

    private Date boardingTime;
    private Date landingTime;
    private Date departureTime;
    private int delay;
    private String gate;

}
