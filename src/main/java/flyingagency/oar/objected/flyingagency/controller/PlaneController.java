package flyingagency.oar.objected.flyingagency.controller;

import flyingagency.oar.objected.flyingagency.model.AirPlane;
import flyingagency.oar.objected.flyingagency.resources.PlaneResource;
import flyingagency.oar.objected.flyingagency.service.FlightService;
import flyingagency.oar.objected.flyingagency.service.PlaneService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping("/plane")
public class PlaneController {

    private final PlaneService planeService;
    private final FlightService flightService;

    @GetMapping("/available")
    public List<AirPlane> getAllAvailablePlanes(@RequestParam Date fromDate, @RequestParam Date endDate) {

        return flightService
                .getFlightsInTimeLine(fromDate, endDate)
                .stream()
                .map(flight -> planeService.findPlaneById(flight.getPlaneId()))
                .collect(Collectors
                        .toCollection(ArrayList::new));
    }

    @GetMapping("/all")
    public List<AirPlane> getAllPlanes() {
        return planeService.getAllPlanes();
    }

    @PostMapping("/add")
    public AirPlane addPlane(@RequestBody PlaneResource planeResource) {
         return planeService.addAirPlane(planeResource);
    }
}
