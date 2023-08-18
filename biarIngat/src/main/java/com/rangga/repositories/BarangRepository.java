package com.rangga.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rangga.models.BarangModel;

@Repository
public interface BarangRepository extends JpaRepository<BarangModel, String> {
	
	@Query(value = "select nama,harga from barang",nativeQuery = true)
	public List<String> dataOnly();

}
