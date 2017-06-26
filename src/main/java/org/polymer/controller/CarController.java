package org.polymer.controller;

import java.util.List;

import org.polymer.model.Car;
import org.polymer.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class CarController {
	
	@Autowired private CarRepository carRepository;	
	
	@GetMapping("/cars")
	public List<Car> getCars() {
		return carRepository.findAll();
	}

}
