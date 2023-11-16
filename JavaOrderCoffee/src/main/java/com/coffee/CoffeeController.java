package com.coffee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coffee.model.CoffeeModel;
import com.coffee.services.CoffeeService;

import lombok.Getter;

@RestController
public class CoffeeController {
	
	@Autowired
	public CoffeeService cs;
	
	@GetMapping("/")
	private List<CoffeeModel> AllData(){
		return cs.allData();
	}
	

}
