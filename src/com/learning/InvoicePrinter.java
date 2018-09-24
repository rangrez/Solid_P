package com.learning;

public class InvoicePrinter {

	// Here should come the print method
	public void print(Invoice invoice) {
		// Printing Logic
	}
}

class InvoicePrinter1 implements IInvoicePrinter {

	// Here should come the print method
	public void print(Invoice invoice) {
		// Printing Logic
	}

	@Override
	public void printComplex(ComplexInvoice invoice) {
		// Another logic
	}

/*	@Override
	public void printWithLogo(Invoice invoice) {
		// We donot want to implement this method
		// We are forced to add this method to our class. Right now, it is one method
		// only but there could be many

		// After implementing IPrintWithLogo you can remove this method from
		// IInvoicePrinter
	}*/
}
