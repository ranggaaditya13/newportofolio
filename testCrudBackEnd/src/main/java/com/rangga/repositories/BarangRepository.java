package com.rangga.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rangga.models.BarangModel;

@Repository
public interface BarangRepository extends JpaRepository<BarangModel, String>{

}
