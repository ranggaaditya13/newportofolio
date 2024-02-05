package com.coffee.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coffee.models.productModel;
import com.coffee.services.productService;

@RestController
public class productController {
	
	@Autowired
	private productService ps;
	
	
	@GetMapping("/data")
	public List<productModel> getAll(){
		return ps.getAll();
	}

}
