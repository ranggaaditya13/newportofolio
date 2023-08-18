package com.rangga.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rangga.models.BarangModel;
import com.rangga.services.BarangService;

@RestController
public class BarangController {
	
	@Autowired
	private BarangService bs;
	
	@RequestMapping("/data")
	public List<BarangModel> data(){
		String nama1 = bs.data().get(0).getNama();
		System.out.println(nama1);
		return bs.data();
	}
	
	@RequestMapping("/dataonly")
	public List<String> dataOnly(){
		return bs.dataOnly();
	}

}
