package com.rangga.parkir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rangga.parkir.models.pembayaranModel;

@Repository
public interface pembayaranRepository extends JpaRepository<pembayaranModel, Long>{

}
