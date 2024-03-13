package com.nit.collection;

public enum TiffinItem {
	IDLY(30),DOSA(40),PURI(20),VADAPAW(50),BAJHI(60)
	;//IT SEPRATE THE NAME CONSTANT TO THE REGULAR PROGRAMS ELEMENTS
	private double price;
	private TiffinItem(double price) {
		this.price=price;
	}
	public double price() {
		return price;
	}
}
