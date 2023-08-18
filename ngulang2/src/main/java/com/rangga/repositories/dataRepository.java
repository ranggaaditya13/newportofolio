package com.rangga.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rangga.models.dataModel;

public interface dataRepository extends JpaRepository<dataModel, String>{
	
	@Query(value = "select kode,nama,harga from barang",nativeQuery = true)
	public List<dataModel> tampilkanData();
	
	@Query(value = "select kode,nama,harga from barang where kode = ?",nativeQuery = true)
	public List<dataModel> tampilkanDataId(String kode);

}
