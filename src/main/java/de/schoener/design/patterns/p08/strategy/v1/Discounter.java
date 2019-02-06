package de.schoener.design.patterns.p08.strategy.v1;

import java.math.BigDecimal;

public interface Discounter {
	void applyDiscount(BigDecimal amount);
}
