package example.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * netflix eureka 服务注册和发现服务
 * @see <a href="https://spring.io/guides/gs/service-registration-and-discovery">service-registration-and-discovery</a>
 */
@EnableEurekaServer // spring-cloud 声明是一个 eureka 服务
@SpringBootApplication
public class Eureka_8761 {

	public static void main(String[] args) {
		SpringApplication.run(Eureka_8761.class, args);
	}
}
