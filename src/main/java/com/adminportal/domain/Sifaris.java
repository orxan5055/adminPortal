package com.adminportal.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_order")
public class Sifaris {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Date sifarisVaxti;
	private Date catdirilmaVaxti;
	private String catdirilmaMetodu;
	private String sifarisDurumu;
	private BigDecimal sifarisCemi;
	
	@OneToMany(mappedBy = "sifaris", cascade=CascadeType.ALL )
	private List<CartItem> cartItemList;
	
	@OneToOne(cascade=CascadeType.ALL)
	private CatdirilmaAdresi catdirilmaAdresi;
	
	@OneToOne(cascade=CascadeType.ALL)
	private OdemeAdresi odemeAdresi;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Payment payment;
	
	@ManyToOne
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public Date getSifarisVaxti() {
		return sifarisVaxti;
	}

	public void setSifarisVaxti(Date sifarisVaxti) {
		this.sifarisVaxti = sifarisVaxti;
	}

	public Date getCatdirilmaVaxti() {
		return catdirilmaVaxti;
	}

	public void setCatdirilmaVaxti(Date catdirilmaVaxti) {
		this.catdirilmaVaxti = catdirilmaVaxti;
	}

	public String getCatdirilmaMetodu() {
		return catdirilmaMetodu;
	}

	public void setCatdirilmaMetodu(String catdirilmaMetodu) {
		this.catdirilmaMetodu = catdirilmaMetodu;
	}

	public String getSifarisDurumu() {
		return sifarisDurumu;
	}

	public void setSifarisDurumu(String sifarisDurumu) {
		this.sifarisDurumu = sifarisDurumu;
	}

	public BigDecimal getSifarisCemi() {
		return sifarisCemi;
	}

	public void setSifarisCemi(BigDecimal sifarisCemi) {
		this.sifarisCemi = sifarisCemi;
	}

	public List<CartItem> getCartItemList() {
		return cartItemList;
	}

	public void setCartItemList(List<CartItem> cartItemList) {
		this.cartItemList = cartItemList;
	}

	public CatdirilmaAdresi getCatdirilmaAdresi() {
		return catdirilmaAdresi;
	}

	public void setCatdirilmaAdresi(CatdirilmaAdresi catdirilmaAdresi) {
		this.catdirilmaAdresi = catdirilmaAdresi;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	

	
	public OdemeAdresi getOdemeAdresi() {
		return odemeAdresi;
	}

	public void setOdemeAdresi(OdemeAdresi odemeAdresi) {
		this.odemeAdresi = odemeAdresi;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}