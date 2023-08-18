package com.rangga.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rangga.models.BarangModel;
import com.rangga.repositories.BarangRepository;

@Service
@Transactional
public class BarangService {
	
	@Autowired
	private BarangRepository br;
	
	public List<BarangModel> data(){
		return br.findAll();
	}
	
	public List<String> dataOnly(){
		return br.dataOnly();
	}

}
