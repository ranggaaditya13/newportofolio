package com.rangga.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;

@Entity
@Table(name = "barang")
@Data
public class BarangModel {
	
	@Id
	@Column(name = "kode")
	private String kode;
	
	@Column(name = "nama")
	private String nama;
	
	@Column(name = "harga")
	private String harga;
	

}
