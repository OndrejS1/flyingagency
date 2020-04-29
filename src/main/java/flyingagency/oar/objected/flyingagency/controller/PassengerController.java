package flyingagency.oar.objected.flyingagency.controller;

import flyingagency.oar.objected.flyingagency.model.Passenger;
import flyingagency.oar.objected.flyingagency.service.PassengerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/passenger")
public class PassengerController {

    private final PassengerService passengerService;

    @PostMapping("/addPassenger")
    public Passenger addPassenger(@RequestBody Passenger passenger) {
        return passengerService.addPassenger(passenger);
    }

    @PutMapping("/modifyPassenger")
    public Passenger modifyTicket(@RequestBody Passenger passenger) {
        return passengerService.modifyPassenger(passenger);
    }

    @DeleteMapping("/deletePassengerById")
    public void deletePassengerById(@RequestParam String passengerId) {
        passengerService.deletePassengerById(passengerId);
    }

    @GetMapping("/getPassengerById")
    public Passenger getPassengerById(@RequestParam String passengerId) {
        return passengerService.getPassenger(passengerId);
    }
}
