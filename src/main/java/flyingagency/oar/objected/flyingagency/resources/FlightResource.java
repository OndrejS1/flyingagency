package flyingagency.oar.objected.flyingagency.resources;

import flyingagency.oar.objected.flyingagency.model.AirPlane;
import flyingagency.oar.objected.flyingagency.model.Flight;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FlightResource {

    private Flight flight;
    private AirPlane airPlane;

}
