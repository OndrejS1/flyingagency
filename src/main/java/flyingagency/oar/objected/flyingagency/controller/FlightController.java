package flyingagency.oar.objected.flyingagency.controller;

import flyingagency.oar.objected.flyingagency.model.Flight;
import flyingagency.oar.objected.flyingagency.model.Passenger;
import flyingagency.oar.objected.flyingagency.service.FlightService;
import flyingagency.oar.objected.flyingagency.service.PassengerService;
import flyingagency.oar.objected.flyingagency.service.PlaneService;
import flyingagency.oar.objected.flyingagency.service.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping("/flight")
public class FlightController {

    private final TicketService ticketService;
    private final PassengerService passengerService;
    private final FlightService flightService;
    private final PlaneService planeService;

    @GetMapping("/getAllPassengersOnFlight")
    public List<Passenger> getAllPassengers(@RequestParam("flightId") String flightId) {

        return ticketService
                .getAllPassengers(flightId)
                .stream()
                .map(ticket -> passengerService.getPassenger(ticket.getPassengerId()))
                .collect(Collectors
                        .toCollection(ArrayList::new));

    }

    @GetMapping("/getAllFlights")
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    @PostMapping("/addFlight")
    public Flight addFlight(@RequestBody Flight flight) {
        return flightService.addFlight(flight);
    }

    @DeleteMapping("/deleteFlightById")
    public void deleteFlightById(@RequestParam String flightId) {
        flightService.deleteFlightById(flightId);
    }
}
