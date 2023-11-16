package com.coffee.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.coffee.model.CoffeeModel;

@Repository
public interface CoffeeRepository extends JpaRepository<CoffeeModel, Long> {
	
	@Query(value = "select * from coffee",nativeQuery = true) 
	public List<CoffeeModel> allData();

}
