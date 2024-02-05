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

import com.rangga.parkir.models.pembayaranModel;
import com.rangga.parkir.services.pembayaranService;

@RestController
@RequestMapping("/pembayaran")
public class pembayaranController {
	
	@Autowired
	private pembayaranService pembayaranService;
	
	@GetMapping("/all")
    public List<pembayaranModel> getAllPembayaran() {
        return pembayaranService.getAllPembayaran();
    }

    @GetMapping("/{id}")
    public pembayaranModel getPembayaranById(@PathVariable Long id) {
        return pembayaranService.getPembayaranById(id).orElse(null);
    }

    @PostMapping("/add")
    public pembayaranModel addPembayaran(@RequestBody pembayaranModel pembayaran) {
        return pembayaranService.prosesPembayaran(pembayaran.getIdKendaraan(), pembayaran.getIdParkir(), pembayaran);
    }

    @PutMapping("/update/{id}")
    public pembayaranModel updatePembayaran(@PathVariable Long id, @RequestBody pembayaranModel pembayaran) {
        return pembayaranService.prosesPembayaran(pembayaran.getIdKendaraan(), pembayaran.getIdParkir(), pembayaran);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePembayaran(@PathVariable Long id) {
        pembayaranService.deletePembayaran(id);
    }

}
