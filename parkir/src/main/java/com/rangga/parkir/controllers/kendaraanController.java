package com.rangga.parkir.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rangga.parkir.models.kendaraanModel;
import com.rangga.parkir.services.kendaraanService;

@RestController
@RequestMapping("/kendaraan")
public class kendaraanController {
	
	@Autowired
	private kendaraanService ks;
	
	@GetMapping("/all")
    public List<kendaraanModel> getAllKendaraan() {
        return ks.getAllKendaraan();
    }

    @GetMapping("/{id}")
    public kendaraanModel getKendaraanById(@PathVariable Long id) {
        return ks.getKendaraanById(id).orElse(null);
    }
    //untuk testing tanpa kondisi 
    @PostMapping("/add")
    public kendaraanModel addKendaraan(@RequestBody kendaraanModel kendaraan) {
        return ks.saveOrUpdateKendaraan(kendaraan);
    }
    
    @PostMapping("/tambah")
    public String tambahKendaraanByCondition(@RequestBody kendaraanModel kendaraan) {  	
        return ks.saveOrUpdateKendaraanWihCon(kendaraan);
    }

    @PutMapping("/update/{id}")
    public kendaraanModel updateKendaraan(@PathVariable Long id, @RequestBody kendaraanModel kendaraan) {
        kendaraan.setId(id);
        return ks.saveOrUpdateKendaraan(kendaraan);
    }
    
    

    @DeleteMapping("/delete/{id}")
    public void deleteKendaraan(@PathVariable Long id) {
        ks.deleteKendaraan(id);
    }

}
