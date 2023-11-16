package com.coffee.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffee.model.CoffeeModel;
import com.coffee.repositories.CoffeeRepository;



@Service
@Transactional
public class CoffeeService {
	
	@Autowired
	private CoffeeRepository cr;
	
	public List<CoffeeModel> allData(){
		return cr.allData();
	}
	

}
