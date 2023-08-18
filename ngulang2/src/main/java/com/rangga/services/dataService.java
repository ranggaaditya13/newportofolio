package com.rangga.services;

import java.util.List;
import java.util.ListResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rangga.models.dataModel;
import com.rangga.repositories.dataRepository;

@Service
@Transactional
public class dataService {
	
	@Autowired
	private dataRepository dr;
	
	public List<dataModel> tampilkanData(){
		return dr.tampilkanData();
	}
	
	public List<dataModel> tampilkanDataId(String kode){
		return dr.tampilkanDataId(kode);
	}

}
