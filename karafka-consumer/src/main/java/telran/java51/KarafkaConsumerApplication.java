package telran.java51;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KarafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KarafkaConsumerApplication.class, args);
	}
	
	@Bean
	Consumer<String> log() {
	    return message -> {
	        System.out.println("Received: " + message);
	    };
	}

}
