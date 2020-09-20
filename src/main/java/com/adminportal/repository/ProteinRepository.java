package com.adminportal.repository;

import org.springframework.data.repository.CrudRepository;

import com.adminportal.domain.Protein;

public interface ProteinRepository extends CrudRepository<Protein, Long>{
	default Protein findOne(Long id) { 
        return (Protein) findById(id).orElse(null); 
}
}