package de.schoener.design.patterns.p11.factorymethod.v1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UppercaseProcessor implements Processor {
	private final Logger logger = LoggerFactory.getLogger(UppercaseProcessor.class);

	@Override
	public void process(String value) {
		logger.info(value.toUpperCase());
	}

}
