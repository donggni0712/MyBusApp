package MyBusApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyBusApplication {

	private final String MY_CONSTATNT = "constatnt";

	public static void main(String[] args) {
		SpringApplication.run(MyBusApplication.class, args);
	}

}