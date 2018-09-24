package com.learning;

public class ComplexInvoice extends Invoice {
	private double _secondTaxRate;

	public double getSecondTaxRate() {
		return _secondTaxRate;
	}

	public void setSecondTaxRate(double secondTaxRate) {
		this._secondTaxRate = secondTaxRate;
	}

	public double calculateTax() {
		return (getSubTotal() * getTaxRate() / 100) + (getSubTotal() * getSecondTaxRate() / 100);
	}
}

class CorrectComplexInvoice {
	private double _subTotal;
	private double _taxRate;

	private double _secondTaxRate;

	public double getSecondTaxRate() {
		return _secondTaxRate;
	}

	public void setSecondTaxRate(double secondTaxRate) {
		this._secondTaxRate = secondTaxRate;
	}

	public double getSubTotal() {
		return _subTotal;
	}

	public void setSubTotal(double _subTotal) {
		this._subTotal = _subTotal;
	}

	public double getTaxRate() {
		return _taxRate;
	}

	public void setTaxRate(double _taxRate) {
		this._taxRate = _taxRate;
	}

	public double calculateTax() {
		return (getSubTotal() * getTaxRate() / 100) + (getSubTotal() * getSecondTaxRate() / 100);
	}

	public double calculateTotal() {
		return getSubTotal()+calculateTax();
	}
}

