package aquilacloud.security.opamvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableFeignClients
@EnableMethodSecurity
public class OpamvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpamvcApplication.class, args);
	}

}
