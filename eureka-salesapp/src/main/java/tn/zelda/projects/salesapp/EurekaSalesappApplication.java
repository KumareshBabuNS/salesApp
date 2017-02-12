package tn.zelda.projects.salesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaSalesappApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSalesappApplication.class, args);
	}
}
