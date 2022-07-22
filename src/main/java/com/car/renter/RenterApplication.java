package com.car.renter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {"com.car.renter"})
@EnableSwagger2
public class RenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RenterApplication.class, args);
	}

}
