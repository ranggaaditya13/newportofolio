package com.rangga.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "barang")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BarangModel {
	
	@Id
	@Column(name = "KODE")
	private String kode;
	
	@Column(name = "NAMA")
	private String nama;
	
	@Column(name = "HARGA")
	private double harga;

}
