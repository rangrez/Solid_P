package com.learning;

public class InvoiceSubTotalValidator extends Validator {

	@Override
	public boolean validate(Invoice invoice) {
		if (invoice.getSubTotal() < 0)
			return false;
		
		return true;
	}
}
