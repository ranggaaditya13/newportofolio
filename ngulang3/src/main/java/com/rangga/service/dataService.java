package com.rangga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rangga.model.dataModel;
import com.rangga.repository.dataRepository;

@Service
@Transactional
public class dataService {

	@Autowired
	private dataRepository dr;
	
	public List<dataModel> getAll(){
		return dr.getAll();
	}
	
	public List<dataModel> getWithHighPrice(){
		return dr.getWithHighPrice();
	}
	
	public List<String> getNameOnly(){
		return dr.getNameOnly();
	}
}
