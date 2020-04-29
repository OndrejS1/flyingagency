package flyingagency.oar.objected.flyingagency.service;

import flyingagency.oar.objected.flyingagency.model.Passenger;
import flyingagency.oar.objected.flyingagency.repository.PassengerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PassengerService {

    private final PassengerRepository passengerRepository;

    public Passenger getPassenger(String passengerId) {
        return passengerRepository
                .findById(passengerId)
                .orElseThrow(() -> new RuntimeException("Passenger with this Id doesn't exist"));
    }

    public Passenger addPassenger(Passenger passenger) {
        return passengerRepository
                .save(passenger);
    }

    public Passenger modifyPassenger(Passenger passenger) {
        return passengerRepository
                .save(passenger);
    }

    public void deletePassengerById(String passengerId) {
        passengerRepository.deleteById(passengerId);
    }

}
