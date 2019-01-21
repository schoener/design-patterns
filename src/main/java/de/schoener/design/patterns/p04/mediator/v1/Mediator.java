package de.schoener.design.patterns.p04.mediator.v1;

import java.math.BigDecimal;

public interface Mediator {
	void registerProducer(Producer producer);

	BigDecimal calculateProductPrice(Product product, int quantity);

}
