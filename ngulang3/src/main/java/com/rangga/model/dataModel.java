package com.rangga.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "barang")
public class dataModel {
	
	@Id
	@Column(name = "kode")
	private String kode;
	
	@Column(name = "nama")
	private String nama;
	
	@Column(name = "harga")
	private String harga;

}
