package com.coffee.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "barang")
public class productModel {
	
	@Id
	@Column(name = "kode")
	private String kode;
	
	@Column(name = "harga")
	private String harga;
	
	@Column(name = "nama")
	private String nama;

}
