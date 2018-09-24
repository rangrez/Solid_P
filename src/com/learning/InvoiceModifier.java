package com.learning;

public class InvoiceModifier {
	private Invoice _invoice;

	public InvoiceModifier(Invoice invoice) {
		_invoice = invoice;
	}

	public void setSubtotal(double subtotal) {
		_invoice.setSubTotal(subtotal);
	}

	public void setTaxRate(double taxRate) {
		_invoice.setTaxRate(taxRate);
	}

	public Invoice generateInvoice() {
		return _invoice;
	}
}
