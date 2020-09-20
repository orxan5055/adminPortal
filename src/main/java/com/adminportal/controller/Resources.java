package com.adminportal.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adminportal.service.ProteinServis;

@RestController
public class Resources {

	@Autowired
	private ProteinServis proteinServis;
	
	@RequestMapping(value="/protein/removeList", method=RequestMethod.POST)
	public String removeList(
			@RequestBody ArrayList<String> productIdList, Model model
			){
		
		for (String id : productIdList) {
			String productId =id.substring(8);
			proteinServis.removeOne(Long.parseLong(productId));
		}
		
		return "delete has successfully be done";
	}
}
