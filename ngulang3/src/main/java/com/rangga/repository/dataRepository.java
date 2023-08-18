package com.rangga.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rangga.model.dataModel;

public interface dataRepository extends JpaRepository<dataModel, String>{
	
	@Query(value = "select * from barang",nativeQuery = true)
	public List<dataModel> getAll();
	
	@Query(value = "select * from barang where harga > 10000",nativeQuery = true)
	public List<dataModel> getWithHighPrice();


}
