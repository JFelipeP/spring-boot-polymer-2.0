package org.polymer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String make;
	private String model;
	private String year;
	private String power;
	private String speed;
	
	public Long getId() {
		return id;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public String getYear() {
		return year;
	}
	public String getPower() {
		return power;
	}
	public String getSpeed() {
		return speed;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", make=" + make + ", model=" + model + ", year=" + year + ", power=" + power
				+ ", speed=" + speed + "]";
	}
	
	
	
	

}
