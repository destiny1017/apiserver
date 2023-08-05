package proxy.apiserver.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import proxy.apiserver.data.RoadTrafficAllVo;
import proxy.apiserver.data.RoadTrafficResponse;
import proxy.apiserver.domain.RoadTrafficService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RoadTrafficController {

    private final RoadTrafficService roadTrafficService;

    @GetMapping("/getRoadTraffic")
    public RoadTrafficAllVo getRoadTraffic() {
        return roadTrafficService.roadTrafficService();
    }
}
