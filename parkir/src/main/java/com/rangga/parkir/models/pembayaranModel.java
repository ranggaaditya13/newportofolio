package com.rangga.parkir.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "pembayaran")
@Data
public class pembayaranModel {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private double totalBiaya;
	    private LocalDateTime waktuPembayaran;
	    private String metodePembayaran;

	    private Long idKendaraan;
	    private Long idParkir;

}
