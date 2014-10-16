package org.japayments.model;

import java.util.Calendar;

public class Excursion {
	private double price;
	private Calendar date;
	
	public Excursion() {
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}
	
}
