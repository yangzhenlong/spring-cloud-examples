package example.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Consul_Client_8082 {

	public static void main(String[] args) {
		SpringApplication.run(Consul_Client_8082.class, args);
	}
}
