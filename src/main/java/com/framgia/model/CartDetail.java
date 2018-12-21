package com.framgia.model;
// Generated Dec 14, 2018 4:21:20 PM by Hibernate Tools 4.3.5.Final

/**
 * CartDetail generated by hbm2java
 */
public class CartDetail {

	private Integer id;
	private Cart cart;
	private Product product;
	private int quantity;
	public CartDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartDetail(Cart cart, Product product, int quantity) {
		super();
		this.cart = cart;
		this.product = product;
		this.quantity = quantity;
	}
	public CartDetail(Integer id, Cart cart, Product product, int quantity) {
		super();
		this.id = id;
		this.cart = cart;
		this.product = product;
		this.quantity = quantity;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
}