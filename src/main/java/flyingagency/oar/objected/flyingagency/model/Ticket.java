package flyingagency.oar.objected.flyingagency.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document
public class Ticket implements Serializable {

    @Id
    private String ticketId;

    @Indexed
    private String flightId;

    @Indexed
    private String passengerId;

    private int cost;
    private String seat;

}
