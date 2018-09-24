package com.learning;

import java.util.List;

public class InvoiceValidator {

	// This class is responsible for validations only. SRP followed. But can you
	// tell me what is the problem with this code ?
	public boolean validate(Invoice invoice) {
		if (invoice.getSubTotal() < 0)
			return false;
		if (invoice.getTaxRate() < 0)
			return false;
		return true;
	}

	// Good Code
	// Through this, i can add new validators and i donot have to change this class
	// Lets add one more validator InvoiceTotalValidator
	private List<Validator> _validators;

	public InvoiceValidator(List<Validator> validators) {
		_validators = validators;
	}

	public boolean validate1(Invoice invoice) {
		return _validators.stream().allMatch(v -> v.validate(invoice));
	}
}
