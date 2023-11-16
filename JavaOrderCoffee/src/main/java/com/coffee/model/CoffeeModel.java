package com.coffee.model;

import javax.persistence.Column;
import javax.persistence.GenerationType;

import lombok.Data;

@javax.persistence.Entity
@javax.persistence.Table(name = "coffee")
@Data
public class CoffeeModel {
	
	@javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name ="coffeeName")
	private String coffeeName;
	
	@Column(name = "price")
	private long price;
	
	@Column(name = "quantity")
	private int quantity;
	
	
	

}
