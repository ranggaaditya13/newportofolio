package com.rangga.parkir.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rangga.parkir.models.parkirModel;

@Repository
public interface parkirRepository extends JpaRepository<parkirModel, Long> {
	 List<parkirModel> findByNamaLokasiIgnoreCase(String namaLokasi);

}
