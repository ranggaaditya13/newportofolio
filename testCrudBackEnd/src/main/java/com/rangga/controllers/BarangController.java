package com.rangga.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rangga.models.BarangModel;
import com.rangga.services.BarangService;

@RestController
@CrossOrigin("http://localhost:3000/")
public class BarangController {
	
	@Autowired
	private BarangService bs;
	
	@GetMapping("/data")
	public List<BarangModel> getData(){
		return bs.getData();
	}
	
	@PostMapping(value = "/save")
	public BarangModel newData(@RequestParam String kode, @RequestParam String nama, @RequestParam String harga ) {
		BarangModel model1 = new BarangModel();
		model1.setKode(kode);
		model1.setNama(nama);
		model1.setHarga(harga);
		return bs.saveData(model1);
	}

}
