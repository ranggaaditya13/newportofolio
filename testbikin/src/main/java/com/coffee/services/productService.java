package com.coffee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coffee.models.productModel;
import com.coffee.repositories.productRepository;

@Service
@Transactional
public class productService {
	
	@Autowired
	private productRepository pr;
	
	public List<productModel> getAll(){
		return pr.findAll();
	}

}
