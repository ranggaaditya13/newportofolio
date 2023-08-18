package com.rangga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rangga.model.dataModel;
import com.rangga.repositories.dataRepository;

@Service
public class dataService {
	
	@Autowired
	private dataRepository dr;
	
	public List<dataModel> allData(){
		return dr.findAll();
	}

}
