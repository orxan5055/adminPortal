package com.adminportal.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class OdemeAdresi {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String OdemeAdresiAdi;
	private String OdemeAdresiKuce1;
	private String OdemeAdresiKuce2;
	private String OdemeAdresiSeher;
	private String OdemeAdresiRegion;
	private String OdemeAdresiOlke;
	private String OdemeAdresiZipkodu;
	
	@OneToOne
	private Sifaris sifaris;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public String getOdemeAdresiAdi() {
		return OdemeAdresiAdi;
	}

	public void setOdemeAdresiAdi(String odemeAdresiAdi) {
		OdemeAdresiAdi = odemeAdresiAdi;
	}

	public String getOdemeAdresiKuce1() {
		return OdemeAdresiKuce1;
	}

	public void setOdemeAdresiKuce1(String odemeAdresiKuce1) {
		OdemeAdresiKuce1 = odemeAdresiKuce1;
	}

	public String getOdemeAdresiKuce2() {
		return OdemeAdresiKuce2;
	}

	public void setOdemeAdresiKuce2(String odemeAdresiKuce2) {
		OdemeAdresiKuce2 = odemeAdresiKuce2;
	}

	public String getOdemeAdresiSeher() {
		return OdemeAdresiSeher;
	}

	public void setOdemeAdresiSeher(String odemeAdresiSeher) {
		OdemeAdresiSeher = odemeAdresiSeher;
	}

	public String getOdemeAdresiRegion() {
		return OdemeAdresiRegion;
	}

	public void setOdemeAdresiRegion(String odemeAdresiRegion) {
		OdemeAdresiRegion = odemeAdresiRegion;
	}

	public String getOdemeAdresiOlke() {
		return OdemeAdresiOlke;
	}

	public void setOdemeAdresiOlke(String odemeAdresiOlke) {
		OdemeAdresiOlke = odemeAdresiOlke;
	}

	public String getOdemeAdresiZipkodu() {
		return OdemeAdresiZipkodu;
	}

	public void setOdemeAdresiZipkodu(String odemeAdresiZipkodu) {
		OdemeAdresiZipkodu = odemeAdresiZipkodu;
	}

	public Sifaris getSifaris() {
		return sifaris;
	}

	public void setSifaris(Sifaris sifaris) {
		this.sifaris = sifaris;
	}

	
}
