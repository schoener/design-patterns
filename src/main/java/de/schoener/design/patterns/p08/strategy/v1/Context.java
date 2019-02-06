package de.schoener.design.patterns.p08.strategy.v1;

import java.math.BigDecimal;

public class Context {
	private final Discounter discounter;

	public Context(Discounter discounter) {
		this.discounter = discounter;
	}

	public void applyDiscount(BigDecimal amount) {
		discounter.applyDiscount(amount);
	}

}
