package com.rangga.parkir.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "kendaraan")
@Data
public class kendaraanModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String platNomor;
    private String jenisKendaraan;
    private LocalDateTime waktuMasuk;
    private Long parkirId;

}
