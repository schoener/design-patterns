package de.schoener.design.patterns.p02.templatemethod.v1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Printer {
	private Logger logger = LoggerFactory.getLogger(Printer.class);
	private static final String MESSAGE = "MeSSaGe";

	public void doPrint() {
		logger.info("About to print the message...");
		logger.info(getConvertedMessage(MESSAGE));
	}

	protected abstract String getConvertedMessage(String message);
}
