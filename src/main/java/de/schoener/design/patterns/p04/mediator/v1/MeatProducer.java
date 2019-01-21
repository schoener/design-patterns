package de.schoener.design.patterns.p04.mediator.v1;

import java.math.BigDecimal;

public class MeatProducer implements Producer {

	@Override
	public BigDecimal calculateProductPrice(Product product, int quantity) {
		BigDecimal productPrice = null;
		if (Product.MEAT == product) {
			if (quantity > 50) {
				productPrice = BigDecimal.valueOf(10.0d);
			} else {
				productPrice = BigDecimal.valueOf(12.0d);
			}
		}
		return productPrice;
	}
}
