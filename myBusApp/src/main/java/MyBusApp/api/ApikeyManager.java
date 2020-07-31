package MyBusApp.api;

import MyBusApp.dotenv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApikeyManager {

    @Autowired
    dotenv env = new dotenv();

    public String getapikey(){
        return env.getApikey();
    }
}
