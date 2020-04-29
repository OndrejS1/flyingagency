package flyingagency.oar.objected.flyingagency.translator;

import flyingagency.oar.objected.flyingagency.model.Flight;
import flyingagency.oar.objected.flyingagency.model.Ticket;
import flyingagency.oar.objected.flyingagency.resources.TicketResource;
import java.util.Optional;

public class TicketTranslator {

    public static TicketResource translate(Ticket ticket, Optional<Flight> flight) {

        TicketResource ticketResource = new TicketResource();

        ticketResource.setTicketId(ticket.getTicketId());
        ticketResource.setCost(ticket.getCost());
        ticketResource.setSeat(ticket.getSeat());
        ticketResource.setFlight(flight.get());

        return ticketResource;
    }
}
