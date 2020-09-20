package com.adminportal.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.adminportal.domain.Protein;
import com.adminportal.service.ProteinServis;

@Controller
@RequestMapping("/protein")
public class ProteinController {
	
	@Autowired

	private ProteinServis proteinServis;
	
	@RequestMapping("/add")
	public String addProtein(Model model) {
		Protein protein = new Protein();
		model.addAttribute("protein", protein);
		return "addProtein";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addProteinPost(@ModelAttribute("protein") Protein protein, HttpServletRequest request) {

		proteinServis.save(protein);
		MultipartFile proteinImage=protein.getProteinSekili();
		
		try {
			byte[] bytes= proteinImage.getBytes();
			String name = protein.getId()+".png";
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File("src/main/resources/static/images/protein/"+name)));
		    stream.write(bytes);
		    stream.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:proteinList";
	}
	@RequestMapping ("/proteinList")
	public String proteinList(Model model)
	{
		List<Protein> proteinList = proteinServis.findAll();
		model.addAttribute("proteinList",proteinList);
		return "proteinList";
	}
	@RequestMapping("/proteinInformation")
	public String proteinInformation(@RequestParam("id") Long id,Model model)
	{
		Protein protein=proteinServis.findOne(id);
		model.addAttribute("protein",protein);
		return "proteinInformation";
	}

	@RequestMapping("/editProteinInfo")
	public String editProteinInfo(@RequestParam("id") Long id,Model model)
	{
		Protein protein = proteinServis.findOne(id);
		model.addAttribute("protein",protein);
		return "editProteinInfo";
	}
	@RequestMapping(value="/editProtein", method=RequestMethod.POST)
	public String editProteinPost(@ModelAttribute("protein") Protein protein,HttpServletRequest request) {
		proteinServis.save(protein);
		MultipartFile proteinImage = protein.getProteinSekili();
		if(!proteinImage.isEmpty())
		{
			try {
				byte[] bytes= proteinImage.getBytes();
				String name = protein.getId()+".png";
				
				Files.delete(Paths.get("src/main/resources/static/images/protein/"+name));
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File("src/main/resources/static/images/protein/"+name)));
			    stream.write(bytes);
			    stream.close();
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "redirect:/protein/proteinInformation?id="+protein.getId();
	}
	@RequestMapping(value="/remove", method=RequestMethod.POST)
	public String remove(
			@ModelAttribute("id") String id, Model model
			) {
		proteinServis.removeOne(Long.parseLong(id.substring(11)));
		List<Protein> bookList = proteinServis.findAll();
		model.addAttribute("bookList", bookList);
		
		return "redirect:/protein/proteinList";
	}
}
