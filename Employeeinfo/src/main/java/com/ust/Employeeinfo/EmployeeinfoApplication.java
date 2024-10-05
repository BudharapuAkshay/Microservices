package com.ust.Employeeinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
public class EmployeeinfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeinfoApplication.class, args);
	}

}
