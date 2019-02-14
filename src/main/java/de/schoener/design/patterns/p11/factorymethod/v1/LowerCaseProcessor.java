package de.schoener.design.patterns.p11.factorymethod.v1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LowerCaseProcessor implements Processor {

	private final Logger logger = LoggerFactory.getLogger(LowerCaseProcessor.class);

	@Override
	public void process(String value) {
		logger.info(value.toLowerCase());
	}

}
