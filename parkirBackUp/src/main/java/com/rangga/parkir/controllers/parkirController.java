package com.rangga.parkir.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rangga.parkir.models.parkirModel;
import com.rangga.parkir.services.parkirService;

@RestController
public class parkirController {
	
	@Autowired
	private parkirService ps;
	
	@GetMapping("/data")
	public List<parkirModel> getAllParkir(){
		return ps.getAllParkir();
	}
	
	@GetMapping("/{namalokasi}")
	public List<parkirModel> getParkirByNamaLokasi(@PathVariable String namalokasi){
		return ps.getParkirByNamaLokasi(namalokasi);
	}
	
	@PostMapping("/data")
	public parkirModel tambahParkir(@RequestBody parkirModel model) {
		return ps.tambahParkir(model);
	}
	
	@PutMapping("/{id}")
	public parkirModel updateParkir(@PathVariable Long id , @RequestBody parkirModel model) {
		return ps.updateParkir(id, model);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteParkir(@PathVariable Long id) {
		ps.hapusParkir(id);
	}
	
	@GetMapping("/get/{namaLokasi}")
    public List<parkirModel> filterByNamaLokasi(@PathVariable String namaLokasi) {
        List<parkirModel> allTempatParkir = ps.getAllParkir();
        return ps.filterByNamaLokasi(allTempatParkir, namaLokasi);
    }

}
