package flyingagency.oar.objected.flyingagency.service;


import flyingagency.oar.objected.flyingagency.model.AirPlane;
import flyingagency.oar.objected.flyingagency.repository.PlaneRepository;
import flyingagency.oar.objected.flyingagency.resources.PlaneResource;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class PlaneService {

    private final PlaneRepository planeRepository;

    public AirPlane findPlaneById(String planeId) {
        return planeRepository
                .findById(planeId)
                .orElseThrow(() -> new RuntimeException("Plane doesn't exist"));
    }

    public AirPlane addAirPlane(PlaneResource planeResource) {
        return planeRepository.save(planeResource.getAirPlane());
    }

    public List<AirPlane> getAllPlanes() {

        return StreamSupport
                .stream(planeRepository
                        .findAll()
                        .spliterator(), false)
                .collect(Collectors.toList());
    }
}
