package de.schoener.design.patterns.p04.mediator.v1;

import java.math.BigDecimal;

public class ProductConsumer implements Consumer {

	private Mediator mediator;

	@Override
	public BigDecimal requestProductPrice(Product product, int quantity) {
		return mediator.calculateProductPrice(product, quantity);
	}

	@Override
	public void registerMediator(Mediator mediator) {
		this.mediator = mediator;
	}

}
