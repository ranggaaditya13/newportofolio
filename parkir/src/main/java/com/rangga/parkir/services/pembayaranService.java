package com.rangga.parkir.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.rangga.parkir.repositories.pembayaranRepository;
import com.rangga.parkir.models.kendaraanModel;
import com.rangga.parkir.models.parkirModel;
import com.rangga.parkir.models.pembayaranModel;
import com.rangga.parkir.repositories.kendaraanRepository;
import com.rangga.parkir.repositories.parkirRepository;


@Service
@Transactional
public class pembayaranService {
	
	@Autowired
    private pembayaranRepository pembayaranRepository;

    @Autowired
    private kendaraanRepository kendaraanRepository;

    @Autowired
    private parkirRepository parkirRepository;

    public List<pembayaranModel> getAllPembayaran() {
        return pembayaranRepository.findAll();
    }

    public Optional<pembayaranModel> getPembayaranById(Long id) {
        return pembayaranRepository.findById(id);
    }
    //pembayaran belum sempurna karena masih dapat menerima data duplikat
    public pembayaranModel prosesPembayaran(Long idKendaraan, Long idParkir, pembayaranModel pembayaran) {
        Optional<kendaraanModel> optionalKendaraan = kendaraanRepository.findById(idKendaraan);
        Optional<parkirModel> optionalParkir = parkirRepository.findById(idParkir);
        

        if (optionalKendaraan.isPresent() && optionalParkir.get().getId() == optionalKendaraan.get().getParkirId()) {
            kendaraanModel kendaraan = optionalKendaraan.get();
            parkirModel parkir = optionalParkir.get();
           
            pembayaran.setIdKendaraan(kendaraan.getId());
            pembayaran.setIdParkir(kendaraan.getParkirId());
            pembayaran.setWaktuPembayaran(LocalDateTime.now());
            pembayaran.setTotalBiaya(parkir.getTarifParkir());
            parkir.setKapasitasTersedia(parkir.getKapasitasTersedia() + 1);
         
            parkirRepository.save(parkir);
            pembayaranRepository.save(pembayaran);

            return pembayaran;
        } else {
            throw new EntityNotFoundException("Kendaraan atau Parkir tidak ditemukan");
        }
    }

    public void deletePembayaran(Long id) {
        pembayaranRepository.deleteById(id);
    }


}
