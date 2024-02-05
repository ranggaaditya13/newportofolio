package com.rangga.parkir.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rangga.parkir.models.kendaraanModel;
import com.rangga.parkir.models.parkirModel;
import com.rangga.parkir.repositories.parkirRepository;

@Service
@Transactional
public class parkirService {
	
	@Autowired
	private parkirRepository pr;
	
	public List<parkirModel> getAllParkir(){
		return pr.findAll();
	}
	
	public List<parkirModel> getParkirByNamaLokasi(String namaLokasi){
		return pr.findByNamaLokasiIgnoreCase(namaLokasi);
	}
	
	public parkirModel tambahParkir(parkirModel parkirmodel) {
		return pr.save(parkirmodel);
	}
	
	public parkirModel updateParkir(Long id, parkirModel model) {
		return pr.findById(id)
				.map(parkirmodel ->{
					parkirmodel.setNamaLokasi(model.getNamaLokasi());
					parkirmodel.setKapasitasMaksimal(model.getKapasitasMaksimal());
					parkirmodel.setKapasitasTersedia(model.getKapasitasTersedia());
					parkirmodel.setTarifParkir(model.getTarifParkir());
					return pr.save(parkirmodel);
				})
				.orElseGet(() -> {
					model.setId(id);
					return pr.save(model);
				});
	}
	//mencoba menggunakan Filter
	public List<parkirModel> filterByNamaLokasi(List<parkirModel> tempatParkirs, String namaLokasi) {
        return tempatParkirs.stream()
                .filter(tempatParkir -> tempatParkir.getNamaLokasi().toLowerCase().contains(namaLokasi.toLowerCase()))
                .collect(Collectors.toList());
    }
	
	public void hapusParkir(Long id) {
		pr.deleteById(id);
	}
	
	 public Optional<parkirModel> getParkirById(Long id) {
	        return pr.findById(id);
	    }

}
