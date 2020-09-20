package com.adminportal.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Protein {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String basliq;
	private String kategoriya;
	private double catdirilmaCekisi;
	private double olanQiymet;
	private double bizimQiymet;
	private boolean aktiv=true;
	
	@Column(columnDefinition="text")
	private String aciqlama;
	private int stokdakiSay;
	
	@Transient
	private MultipartFile proteinSekili;
	
	
	@OneToMany(mappedBy = "protein")
	@JsonIgnore
	private List<ProteinToCartItem> proteinToCartItemList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getBasliq() {
		return basliq;
	}

	public void setBasliq(String basliq) {
		this.basliq = basliq;
	}

	public String getKategoriya() {
		return kategoriya;
	}

	public void setKategoriya(String kategoriya) {
		this.kategoriya = kategoriya;
	}

	public double getCatdirilmaCekisi() {
		return catdirilmaCekisi;
	}

	public void setCatdirilmaCekisi(double catdirilmaCekisi) {
		this.catdirilmaCekisi = catdirilmaCekisi;
	}

	public double getOlanQiymet() {
		return olanQiymet;
	}

	public void setOlanQiymet(double olanQiymet) {
		this.olanQiymet = olanQiymet;
	}

	public double getBizimQiymet() {
		return bizimQiymet;
	}

	public void setBizimQiymet(double bizimQiymet) {
		this.bizimQiymet = bizimQiymet;
	}

	public boolean isAktiv() {
		return aktiv;
	}

	public void setAktiv(boolean aktiv) {
		this.aktiv = aktiv;
	}

	public String getAciqlama() {
		return aciqlama;
	}

	public void setAciqlama(String aciqlama) {
		this.aciqlama = aciqlama;
	}

	public int getStokdakiSay() {
		return stokdakiSay;
	}

	public void setStokdakiSay(int stokdakiSay) {
		this.stokdakiSay = stokdakiSay;
	}

	public MultipartFile getProteinSekili() {
		return proteinSekili;
	}

	public void setProteinSekili(MultipartFile proteinSekili) {
		this.proteinSekili = proteinSekili;
	}

	public List<ProteinToCartItem> getProteinToCartItem() {
		return proteinToCartItemList;
	}

	public void setProteinToCartItem(List<ProteinToCartItem> proteinToCartItemList) {
		this.proteinToCartItemList = proteinToCartItemList;
	}
	
	
}
