package bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;

@Controller
@EnableAutoConfiguration
public class ServerMain {
	
	public static void main(String[] args) {
		SpringApplication.run(ServerMain.class, args);
	}
}
