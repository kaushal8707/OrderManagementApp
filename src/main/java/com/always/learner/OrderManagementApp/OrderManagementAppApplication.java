package com.always.learner.OrderManagementApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableAutoConfiguration
@EnableHystrix
@EnableHystrixDashboard
public class OrderManagementAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderManagementAppApplication.class, args);
	}
}