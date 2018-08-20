package com.capgemini.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private int p_id;
	private String p_name;
	private double price;
	private int sold;
	private int p_view;
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSold() {
		return sold;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}
	public int getP_view() {
		return p_view;
	}
	public void setP_view(int p_view) {
		this.p_view = p_view;
	}
	public Product(int p_id, String p_name, double price, int sold, int p_view) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.price = price;
		this.sold = sold;
		this.p_view = p_view;
	}
	
	public Product() {}
}
