package com.myecommerce.model;

public class Book {

	public int id;
	
	public String title;
	
	public String description;
	
	public double cost;
	
	public Book(int id, String title, String description, double cost) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
}
