package com.learning;

public interface IInvoicePrinter {
	public void print(Invoice invoice);

	public void printComplex(ComplexInvoice invoice);

	// public void printWithLogo(Invoice invoice);

}
