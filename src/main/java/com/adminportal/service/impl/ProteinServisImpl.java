package com.adminportal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminportal.domain.Protein;
import com.adminportal.repository.ProteinRepository;
import com.adminportal.service.ProteinServis;

@Service
public class ProteinServisImpl implements  ProteinServis{

	@Autowired
	private ProteinRepository proteinRepository;
	
	
	@Override
	public Protein save(Protein Protein) {
		return proteinRepository.save(Protein);
	}


	@Override
	public List<Protein> findAll() {
		return (List<Protein>) proteinRepository.findAll();
	}


	@Override
	public Protein findOne(Long id) {
		return proteinRepository.findOne(id);
	}


	@Override
	public void removeOne(Long id) {
		proteinRepository.deleteById(id);
		
	}

}
