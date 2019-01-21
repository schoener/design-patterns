package de.schoener.design.patterns.p04.mediator.v1;

import java.math.BigDecimal;

public interface Consumer {
	BigDecimal requestProductPrice(Product product, int quantity);

	void registerMediator(Mediator mediator);
}
