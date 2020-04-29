package flyingagency.oar.objected.flyingagency.resources;

import flyingagency.oar.objected.flyingagency.model.Flight;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TicketResource {

    private String ticketId;
    private Flight flight;
    private int cost;
    private String seat;

}
