package com.rangga.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rangga.models.BarangModel;
import com.rangga.services.BarangService;

@RestController
public class BarangController {
	
	@Autowired
	private BarangService bs;
	
	@GetMapping("/data")
	public List<BarangModel> getData(){
		return bs.getData();
	}

}
