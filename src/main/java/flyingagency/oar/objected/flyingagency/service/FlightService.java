package flyingagency.oar.objected.flyingagency.service;

import flyingagency.oar.objected.flyingagency.model.Flight;
import flyingagency.oar.objected.flyingagency.repository.FlightRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class FlightService {

    private final FlightRepository flightRepository;

    public List<Flight> getFlightsInTimeLine(Date startDate, Date endDate) {

        return StreamSupport
                .stream(flightRepository
                        .findAllByDepartureTimeLessThanEqualAndLandingTimeGreaterThanEqual(startDate, endDate)
                        .spliterator(), false)
                .collect(Collectors.toList());
    }

    public Flight addFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    public void deleteFlightById(String flightId) {
         flightRepository.deleteById(flightId);
    }

    public List<Flight> getAllFlights() {
        return StreamSupport
                .stream(flightRepository
                        .findAll()
                        .spliterator(), false)
                .collect(Collectors.toList());
    }

    public Optional<Flight> findFlightById(String flightId) {
        return flightRepository.findById(flightId);
    }


}
