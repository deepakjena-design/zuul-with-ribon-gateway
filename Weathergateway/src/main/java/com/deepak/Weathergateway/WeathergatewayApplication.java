package com.deepak.Weathergateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class WeathergatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeathergatewayApplication.class, args);
	}

}
