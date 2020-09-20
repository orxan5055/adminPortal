package com.adminportal.service;

import java.util.List;

import com.adminportal.domain.Protein;

public interface ProteinServis {

	Protein save(Protein book);
	List<Protein> findAll();
	Protein findOne(Long id);
	
	void removeOne(Long id);
}
