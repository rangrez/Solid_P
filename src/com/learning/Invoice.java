package com.learning;

public class Invoice {
	private double _subTotal;
	private double _taxRate;

	//Getters and Setters
	public double getSubTotal() {
		return _subTotal;
	}

	public void setSubTotal(double subtotal) {
		this._subTotal = subtotal;
	}

	public double getTaxRate() {
		return _taxRate;
	}

	public void setTaxRate(double d) {
		this._taxRate = d;
	}

	//Responsibilities
	public double calculateTax() {
		return _subTotal * _taxRate / 100;
	}

	public double calculateTotal() {
		return _subTotal + calculateTax();
	}

	public void print(Invoice invoice) {
		//Printing Logic
	}
}
