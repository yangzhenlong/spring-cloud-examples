package example;

import java.util.List;

import java.util.stream.Collectors;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Eureka_Client_8080 {

	public static void main(String[] args) {
		SpringApplication.run(Eureka_Client_8080.class, args);
	}
}

@RestController
class ServiceInstanceRestController {

	@Resource
	private DiscoveryClient discoveryClient;
	@Value("${spring.application.name}")
	private String appName;

	@RequestMapping("/service-instances")
	public List<String> serviceInstancesByApplicationName() {
		return this.discoveryClient.getInstances(appName).stream()
				.map(instance -> instance.getUri().toString())
				.collect(Collectors.toList());
	}
}
