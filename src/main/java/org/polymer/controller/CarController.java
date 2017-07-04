package org.polymer.controller;

import java.util.List;

import org.polymer.model.Car;
import org.polymer.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/api")
@Controller
public class CarController {
	
	@Autowired private CarRepository carRepository;	
	
	@GetMapping("/cars")
	@ResponseBody
	public List<Car> getCars() {
		return carRepository.findAll();
	}
	
	@PostMapping(value="/save", consumes={"application/json"})
	@ResponseBody
	public Car save(@RequestBody Car car) {		
		return carRepository.save(car);
	}

}
