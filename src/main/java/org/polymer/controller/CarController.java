package org.polymer.controller;

import java.util.List;

import org.polymer.model.Car;
import org.polymer.repository.CarRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping(value="/cars", consumes={"application/json"})	
	public Car save(@RequestBody Car car) {		
		return carRepository.save(car);
	}
	
	@DeleteMapping("/cars/{id}")
	public Car delete(@PathVariable Long id) {
		Car car = carRepository.findOne(id);
		carRepository.delete(car);
		return car;		
	}
	
	@PutMapping("/cars/{id}")
	public Car update(@PathVariable Long id, @RequestBody Car car) {
		Car existingCar = carRepository.findOne(id);
		BeanUtils.copyProperties(car, existingCar);
		return carRepository.saveAndFlush(existingCar);
	}

}
