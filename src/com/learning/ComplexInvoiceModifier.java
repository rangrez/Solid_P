package com.learning;

public class ComplexInvoiceModifier {
	private ComplexInvoice _complexInvoice;
	public ComplexInvoiceModifier(ComplexInvoice complexInvoice) {
		_complexInvoice = complexInvoice;
	}
	
	public void setSubTotal(double subTotal) {
		_complexInvoice.setSubTotal(subTotal);
	}
	
	public void setTaxRate(double taxRate) {
		_complexInvoice.setTaxRate(taxRate);
	}
	
	public void setSecondTaxRate(double taxRate) {
		_complexInvoice.setSecondTaxRate(taxRate);
	}

	public ComplexInvoice generateInvoice() {
		return _complexInvoice;
	}
}
