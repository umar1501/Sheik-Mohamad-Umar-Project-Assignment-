package com.example.demo.repository;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Car;



@Repository
public class CarRepository {
	
	@Autowired
	private JdbcTemplate template;
	
	public int addCar(Car entity) {
		SimpleJdbcInsert inserter = new SimpleJdbcInsert(template);
		
		
		inserter.withTableName("car").usingColumns("brand", "model", "yom", "kms_traveled", "status");
		
		BeanPropertySqlParameterSource sql = new BeanPropertySqlParameterSource(entity);
		
		return inserter.execute(sql);
	}
	
	public List<Car> getAllCars(){
		
		String sql = "select * from car";
		
		List<Car> carList = template.query(sql, BeanPropertyRowMapper.newInstance(Car.class));
		
		return carList;
	}
    public List<Car> getCarsForSale(){
		
		String sql = "select * from car where status = 'unsold'";
		
		List<Car> carList = template.query(sql, BeanPropertyRowMapper.newInstance(Car.class));
		
		return carList;
	}
    
   
    public List<Car> getToyotaBrand(){
		
		String sql = "select * from car where brand = 'Toyota'";
		
		List<Car> carList = template.query(sql, BeanPropertyRowMapper.newInstance(Car.class));
		
		return carList;
	}

    public List<Car> getMahindraBrand(){
		
		String sql = "select * from car where brand = 'Mahindra'";
		
		List<Car> carList = template.query(sql, BeanPropertyRowMapper.newInstance(Car.class));
		
		return carList;
	}

    public List<Car> getHondaBrand(){
	
	String sql = "select * from car where brand = 'Honda'";
	
	List<Car> carList = template.query(sql, BeanPropertyRowMapper.newInstance(Car.class));
	
	return carList;
    }
	
}
