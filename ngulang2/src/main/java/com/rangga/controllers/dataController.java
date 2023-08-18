package com.rangga.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rangga.models.dataModel;
import com.rangga.services.dataService;

@RestController
public class dataController {
	
	@Autowired
	private dataService ds;
	
	
	@GetMapping("/data")
	public List<dataModel> tampilkanData(){
		return ds.tampilkanData();
	}
	
	@GetMapping("/dataid/{kode}")
	public List<dataModel> tampilkanDataId(@PathVariable("kode") String kode){
		return ds.tampilkanDataId(kode);
	}

}
