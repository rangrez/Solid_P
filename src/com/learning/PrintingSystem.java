package com.learning;

public class PrintingSystem {
	private InvoicePrinter _invoicePrinter;

	public PrintingSystem(InvoicePrinter invoicePrinter) {
		_invoicePrinter = invoicePrinter;
	}

	public void print(Invoice invoice) {
		_invoicePrinter.print(invoice);
	}
}

// can anyone detect the problem here ?

// InvoicePrinter in HTML
// InvoicePrinter in PDF

class CorrectPrintingSystem {
	private IInvoicePrinter _invoicePrinter;

	public CorrectPrintingSystem(IInvoicePrinter invoicePrinter) {
		_invoicePrinter = invoicePrinter;
	}

	public void print(Invoice invoice) {
		_invoicePrinter.print(invoice);
	}
}
//This is more flexible