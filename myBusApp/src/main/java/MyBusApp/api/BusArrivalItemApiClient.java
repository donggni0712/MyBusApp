package MyBusApp.api;

import MyBusApp.domain.BusArrivalItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BusArrivalItemApiClient {
    @Autowired
    RestTemplate restTemplate = new RestTemplate();

    private String BUSARRIVALITEM_REQUEST_URI = "https://www.data.go.kr/iim/api/getBusArrivalItem?serviceKey={apiKey}&stationId={stationId}&routeId={routeId}&staOrder={staOrder}";

    public BusArrivalItem getBusArrivalItem(int stationId, int routeId, int staOrder,String apikey){
        BusArrivalItem busArrivalItem = restTemplate.getForObject(BUSARRIVALITEM_REQUEST_URI,BusArrivalItem.class,apikey,stationId,routeId,staOrder);
        return busArrivalItem;
    }

}
