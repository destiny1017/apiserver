package proxy.apiserver.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoadTrafficAllVo {
    private String code;
    private String message;
    private Long count;
    private List<RoadTrafficResponse> trafficAll = new ArrayList<>();
}