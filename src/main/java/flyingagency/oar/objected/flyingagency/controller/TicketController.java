package flyingagency.oar.objected.flyingagency.controller;

import flyingagency.oar.objected.flyingagency.model.Ticket;
import flyingagency.oar.objected.flyingagency.resources.TicketResource;
import flyingagency.oar.objected.flyingagency.service.FlightService;
import flyingagency.oar.objected.flyingagency.service.PassengerService;
import flyingagency.oar.objected.flyingagency.service.TicketService;
import flyingagency.oar.objected.flyingagency.translator.TicketTranslator;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping("/ticket")
public class TicketController {

    private final TicketService ticketService;
    private final FlightService flightService;


    @PostMapping("/addTicket")
    public Ticket addTicket(@RequestBody Ticket ticket) {
        return ticketService.modifyOrAddTicket(ticket);
    }

    @PutMapping("/modifyTicket")
    public Ticket modifyTicket(@RequestBody Ticket ticket) {
        return ticketService.modifyOrAddTicket(ticket);
    }

    @DeleteMapping("/deleteTicketById")
    public void modifyTicket(@RequestParam String ticketId) {
         ticketService.deleteTicketById(ticketId);
    }

    @GetMapping("/findTicketById")
    public Ticket getTicketById(@RequestParam String ticketId) {
         return ticketService.getTicketById(ticketId);
    }

    @GetMapping("/getAllTicketsByPassengerId")
    public List<TicketResource> getAllTicketsByPassengerId(@RequestParam("passengerId") String passengerId) {

        List<Ticket> ticket = ticketService.getAllTicketsByPassengerId(passengerId);

        return ticket.stream()
                .map(t -> TicketTranslator.translate(t, flightService.findFlightById(t.getFlightId())))
                .collect(Collectors.toList());
    }
}
