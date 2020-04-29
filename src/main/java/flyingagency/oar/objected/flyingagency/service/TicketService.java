package flyingagency.oar.objected.flyingagency.service;

import flyingagency.oar.objected.flyingagency.model.Ticket;
import flyingagency.oar.objected.flyingagency.repository.TicketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@Service
@AllArgsConstructor
public class TicketService {

    final private TicketRepository ticketRepository;

    public Ticket getTicketById(String ticketId) {
        Optional<Ticket> maybeTicket = ticketRepository.findById(ticketId);
        return maybeTicket.orElseThrow(() -> new RuntimeException("Ticket with this ticketId doesn't exist"));
    }

    public Ticket modifyOrAddTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public List<Ticket> getAllPassengers(String flightId) {

        return  StreamSupport
                .stream(ticketRepository
                        .findAllByFlightId(flightId)
                        .spliterator(), false)
                .collect(Collectors.toList());
    }

    public List<Ticket> getAllTicketsByPassengerId(String passengerId) {

        return StreamSupport
                .stream(ticketRepository
                        .findAllByPassengerId(passengerId)
                        .spliterator(), false)
                .collect(Collectors.toList());
    }

    public void deleteTicketById(String ticketId) {
        ticketRepository.deleteById(ticketId);
    }
}
