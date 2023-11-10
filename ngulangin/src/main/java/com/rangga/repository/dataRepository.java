package com.rangga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rangga.model.dataModel;

@Repository
public interface dataRepository extends JpaRepository<dataModel, String>{

}
