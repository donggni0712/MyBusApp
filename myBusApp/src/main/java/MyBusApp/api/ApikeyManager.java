package MyBusApp.api;

import lombok.Data;
import org.springframework.stereotype.Service;

@Service
public class ApikeyManager {
    public String getapikey(){
        return "test";
    }
}
