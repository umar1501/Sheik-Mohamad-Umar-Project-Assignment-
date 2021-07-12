package com.example.demo.models;

import org.springframework.stereotype.Controller;

@Controller
public class Car implements Comparable<Car>{
	
	private String brand;
	private String model;
	private int yom;
	private int kms_traveled;
	private String status;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYom() {
		return yom;
	}
	public void setYom(int yom) {
		this.yom = yom;
	}
	public int getKms_traveled() {
		return kms_traveled;
	}
	public void setKms_traveled(int kms_traveled) {
		this.kms_traveled = kms_traveled;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", yom=" + yom + ", kms_traveled=" + kms_traveled
				+ ", status=" + status + "]";
	}
	public Car(String brand, String model, int yom, int kms_traveled, String status) {
		super();
		this.brand = brand;
		this.model = model;
		this.yom = yom;
		this.kms_traveled = kms_traveled;
		this.status = status;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return 0;
	}


}
