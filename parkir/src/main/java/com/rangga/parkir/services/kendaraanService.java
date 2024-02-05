package com.rangga.parkir.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rangga.parkir.models.kendaraanModel;
import com.rangga.parkir.models.parkirModel;
import com.rangga.parkir.repositories.kendaraanRepository;
import com.rangga.parkir.repositories.parkirRepository;

@Service
@Transactional
public class kendaraanService {
	
	 	@Autowired
	    private kendaraanRepository kr;
	 	
	 	@Autowired
	 	private parkirService ParkirService;
	 	
	 	@Autowired
	 	private parkirRepository pr;

	    public List<kendaraanModel> getAllKendaraan() {
	        return kr.findAll();
	    }

	    public Optional<kendaraanModel> getKendaraanById(Long id) {
	        return kr.findById(id);
	    }

	    public kendaraanModel saveOrUpdateKendaraan(kendaraanModel kendaraan) {
	    	kendaraan.setWaktuMasuk(LocalDateTime.now());
	        return kr.save(kendaraan);
	    }
	    
	    public String saveOrUpdateKendaraanWihCon(kendaraanModel kendaraan) {
	    	kendaraan.setWaktuMasuk(LocalDateTime.now());
	    	
	    	Optional<parkirModel> cekParkir = ParkirService.getParkirById(kendaraan.getParkirId());
	    	 if (cekParkir.isPresent()) {
	    	        parkirModel pmodel = cekParkir.get();
	    	        if (pmodel.getKapasitasTersedia() > 0) {
	    	            pmodel.setKapasitasTersedia(pmodel.getKapasitasTersedia() - 1);

	    	            kr.save(kendaraan);
	    	            pr.save(pmodel);
	    	            
	    	            return "Berhasil : " + pmodel.getKapasitasTersedia();
	    	        } else {
	    	            return "Gagal: Kapasitas parkir penuh";
	    	        }
	    	    } else {
	    	        return "Gagal: Parkir tidak ditemukan";
	    	    }
	       
	    }

	    public void deleteKendaraan(Long id) {
	        kr.deleteById(id);
	    }

}
