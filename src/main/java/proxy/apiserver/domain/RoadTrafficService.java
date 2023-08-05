package proxy.apiserver.domain;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import proxy.apiserver.data.RoadTrafficAllVo;
import proxy.apiserver.data.RoadTrafficResponse;

import java.util.List;

@Service
public class RoadTrafficService {

    public RoadTrafficAllVo roadTrafficService() {
        WebClient webClient = WebClient.create("http://data.ex.co.kr");
        RoadTrafficAllVo roadTrafficAll = webClient.get()
                .uri("/openapi/trafficapi/trafficAll?key=test&type=json&exDivCode=00&tcsType=1&tmType=1")
                .retrieve()
                .bodyToMono(RoadTrafficAllVo.class)
                .block();

        return roadTrafficAll;
    }

}
