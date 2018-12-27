package com.framgia.model;
// Generated Dec 14, 2018 4:21:20 PM by Hibernate Tools 4.3.5.Final

import java.util.ArrayList;

import java.util.List;

/**
 * Carts generated by hbm2java
 */
public class Cart {

	private Integer id;
	private User user;
	private Integer status;
	private List<CartDetail> cartDetails = new ArrayList<CartDetail>();

	public Cart() {

	}

	public Cart(Integer id) {
		this.id = id;
	}

	public Cart(Integer id, User user, Integer status, List<CartDetail> cartDetails) {
		this.id = id;
		this.user = user;
		this.status = status;
		this.cartDetails = cartDetails;
	}

	public Cart(User user, Integer status, List<CartDetail> cartDetails) {
		super();
		this.user = user;
		this.status = status;
		this.cartDetails = cartDetails;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<CartDetail> getCartDetails() {
		return cartDetails;
	}

	public void setCartDetails(List<CartDetail> cartDetails) {
		this.cartDetails = cartDetails;
	}

}
