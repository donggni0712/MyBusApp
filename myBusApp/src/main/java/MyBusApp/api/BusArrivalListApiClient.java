package MyBusApp.api;

import MyBusApp.domain.BusArrivalList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BusArrivalListApiClient {
    @Autowired
    RestTemplate restTemplate = new RestTemplate();
    @Autowired
    ApikeyManager apikeyManager = new ApikeyManager();

    private String BUSARRIVALITEM_REQUEST_URI = "https://www.data.go.kr/iim/api/getBusArrivalList?serviceKey={apikey}&stationId={stationId}";
    public BusArrivalList getBusArrivalList(int stationId){
        String apikey = apikeyManager.getapikey();
        BusArrivalList busArrivalList = restTemplate.getForObject(BUSARRIVALITEM_REQUEST_URI, BusArrivalList.class,apikey,stationId);
        return busArrivalList;
    }

}