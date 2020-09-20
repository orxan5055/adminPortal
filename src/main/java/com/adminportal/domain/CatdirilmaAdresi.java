package com.adminportal.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CatdirilmaAdresi {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String CatdirilmaAdresiAdi;
	private String CatdirilmaAdresiKuce1;
	private String CatdirilmaAdresiKuce2;
	private String CatdirilmaAdresiSeher;
	private String CatdirilmaAdresiRegion;
	private String CatdirilmaAdresiOlke;
	private String CatdirilmaAdresiZipkodu;
	
	
	@OneToOne
	private Sifaris sifaris;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCatdirilmaAdresiAdi() {
		return CatdirilmaAdresiAdi;
	}


	public void setCatdirilmaAdresiAdi(String catdirilmaAdresiAdi) {
		CatdirilmaAdresiAdi = catdirilmaAdresiAdi;
	}


	public String getCatdirilmaAdresiKuce1() {
		return CatdirilmaAdresiKuce1;
	}


	public void setCatdirilmaAdresiKuce1(String catdirilmaAdresiKuce1) {
		CatdirilmaAdresiKuce1 = catdirilmaAdresiKuce1;
	}


	public String getCatdirilmaAdresiKuce2() {
		return CatdirilmaAdresiKuce2;
	}


	public void setCatdirilmaAdresiKuce2(String catdirilmaAdresiKuce2) {
		CatdirilmaAdresiKuce2 = catdirilmaAdresiKuce2;
	}


	public String getCatdirilmaAdresiSeher() {
		return CatdirilmaAdresiSeher;
	}


	public void setCatdirilmaAdresiSeher(String catdirilmaAdresiSeher) {
		CatdirilmaAdresiSeher = catdirilmaAdresiSeher;
	}


	public String getCatdirilmaAdresiRegion() {
		return CatdirilmaAdresiRegion;
	}


	public void setCatdirilmaAdresiRegion(String catdirilmaAdresiRegion) {
		CatdirilmaAdresiRegion = catdirilmaAdresiRegion;
	}


	public String getCatdirilmaAdresiOlke() {
		return CatdirilmaAdresiOlke;
	}


	public void setCatdirilmaAdresiOlke(String catdirilmaAdresiOlke) {
		CatdirilmaAdresiOlke = catdirilmaAdresiOlke;
	}


	public String getCatdirilmaAdresiZipkodu() {
		return CatdirilmaAdresiZipkodu;
	}


	public void setCatdirilmaAdresiZipkodu(String catdirilmaAdresiZipkodu) {
		CatdirilmaAdresiZipkodu = catdirilmaAdresiZipkodu;
	}


	public Sifaris getSifaris() {
		return sifaris;
	}


	public void setSifaris(Sifaris sifaris) {
		this.sifaris = sifaris;
	}


	

}
