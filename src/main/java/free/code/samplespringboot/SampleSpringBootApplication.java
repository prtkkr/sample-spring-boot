package free.code.samplespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class SampleSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SampleSpringBootApplication.class);
		application.setDefaultProperties(Collections.singletonMap("server.port", "8084"));
		application.run();
	}

}
