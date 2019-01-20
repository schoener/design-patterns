package de.schoener.design.patterns.p04.mediator.v1;

import java.math.BigDecimal;

public interface Producer {
	BigDecimal calculateProductPrice(Product product, int quantity);
}
