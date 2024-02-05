package com.rangga.parkir.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name ="parkir")
public class parkirModel {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String namaLokasi;
	    private int kapasitasMaksimal;
	    private int kapasitasTersedia;
	    private double tarifParkir;

}
