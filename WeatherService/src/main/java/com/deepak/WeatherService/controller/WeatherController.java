package com.deepak.WeatherService.controller;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
	
	@Value("${server.port}")
	private String port;
	
	private String[] weather = new String[] {"Rainy","Winter","Sunny","Cloudy"};
	
	@GetMapping("/getWeather")
	public String getWeather() {
		
		return "Current wetaher "+ weather[ThreadLocalRandom.current().nextInt(1, 4)]+" on port "+port;
		
	}
	

}
