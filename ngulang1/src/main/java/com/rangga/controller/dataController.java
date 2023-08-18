package com.rangga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rangga.model.dataModel;
import com.rangga.service.dataService;

@RestController
public class dataController {
	
	@Autowired
	private dataService ds;
	
	@GetMapping("/data")
	public List<dataModel> AllData(){
		return ds.allData();
	}

}
