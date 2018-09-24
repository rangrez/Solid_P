package com.learning;

public class InvoiceTaxRateValidator extends Validator {

	@Override
	public boolean validate(Invoice invoice) {
		if (invoice.getTaxRate() < 0)
			return false;

		return true;
	}

}
