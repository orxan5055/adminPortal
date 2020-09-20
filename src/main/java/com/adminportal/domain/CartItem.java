package com.adminportal.domain;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CartItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int qty;
	private BigDecimal subtotal;
	
	@OneToOne
	private Protein protein;
	
	@OneToMany(mappedBy = "cartItem")
	@JsonIgnore
	private List<ProteinToCartItem> proteinToCartItemList;
	
	@ManyToOne
	@JoinColumn(name="shopping_cart_id")
	private ShoppingCart shoppingCart;
	
	@ManyToOne
	@JoinColumn(name="sifaris_id")
	private Sifaris sifaris;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}



	public Protein getProtein() {
		return protein;
	}

	public void setProtein(Protein protein) {
		this.protein = protein;
	}

	public List<ProteinToCartItem> getProteinToCartItemList() {
		return proteinToCartItemList;
	}

	public void setBookToCartItemList(List<ProteinToCartItem> proteinToCartItemList) {
		this.proteinToCartItemList = proteinToCartItemList;
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public Sifaris getSifaris() {
		return sifaris;
	}

	public void setSifaris(Sifaris sifaris) {
		this.sifaris = sifaris;
	}

	public void setProteinToCartItemList(List<ProteinToCartItem> proteinToCartItemList) {
		this.proteinToCartItemList = proteinToCartItemList;
	}

	
	
	
}
