package de.schoener.design.patterns.p02.templatemethod.v1;

public class UppercasePrinter extends Printer {

	@Override
	protected String getConvertedMessage(String message) {
		return message.toUpperCase();
	}

}
