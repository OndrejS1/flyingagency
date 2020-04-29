package flyingagency.oar.objected.flyingagency.repository;

import flyingagency.oar.objected.flyingagency.model.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TicketRepository extends MongoRepository<Ticket, String> {

    Iterable<Ticket> findAllByFlightId(String flightId);

    Iterable<Ticket> findAllByPassengerId(String passengerId);

}
