package de.schoener.design.patterns.p08.strategy.v1;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EasterDiscounter implements Discounter {
	private final Logger logger = LoggerFactory.getLogger(EasterDiscounter.class);

	@Override
	public void applyDiscount(BigDecimal amount) {
		logger.info("Got discount {}", amount.multiply(BigDecimal.valueOf(0.9)));
	}
}
