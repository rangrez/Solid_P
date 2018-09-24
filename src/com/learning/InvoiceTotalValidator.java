package com.learning;

public class InvoiceTotalValidator extends Validator {

	@Override
	public boolean validate(Invoice invoice) {
		return invoice.calculateTax() >= 0;
	}

}
