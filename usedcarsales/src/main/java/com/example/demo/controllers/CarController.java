package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.example.demo.models.Car;
import com.example.demo.repository.CarRepository;



@Controller
public class CarController {
	@Autowired
	private Car car;
	
	@Autowired
	private CarRepository repo;
	
	@RequestMapping(value = "/cars", method = RequestMethod.GET)
	public String initForm(Model model) 
	{
		model.addAttribute("command", car);
		return "addcar";
	}
	
	
	@RequestMapping(value = "/cars", method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("command") Car car, Model model)
	
	{
		//System.out.println(car);
		
		int rowAdded = repo.addCar(car);
		
		model.addAttribute("rowAdded", rowAdded);
		
		return "addcar";
		
	}
	
	@RequestMapping(value = "/cars/all", method = RequestMethod.GET)
	public String findAllCars(Model model)
	{
		List<Car> list = repo.getAllCars();
		model.addAttribute("list", list);
		return "showcar";
	}
	
	@RequestMapping(value = "/cars/carsforsale", method = RequestMethod.GET)
	public String findCarsForSale(Model model)
	{
		List<Car> list = repo.getCarsForSale();
		model.addAttribute("list", list);
		return "showcar";
	}
	
	
	
	@RequestMapping(value = "/cars/toyotabrand", method = RequestMethod.GET)
	public String findToyotaBrand(Model model)
	{
		List<Car> list = repo.getToyotaBrand();
		model.addAttribute("list", list);
		return "showcar";
	}
	
	@RequestMapping(value = "/cars/mahindrabrand", method = RequestMethod.GET)
	public String findMahindraBrand(Model model)
	{
		List<Car> list = repo.getMahindraBrand();
		model.addAttribute("list", list);
		return "showcar";
	}
	
	@RequestMapping(value = "/cars/hondabrand", method = RequestMethod.GET)
	public String findHondaBrand(Model model)
	{
		List<Car> list = repo.getHondaBrand();
		model.addAttribute("list", list);
		return "showcar";
	}


}
