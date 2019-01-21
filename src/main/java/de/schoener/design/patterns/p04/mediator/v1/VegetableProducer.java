package de.schoener.design.patterns.p04.mediator.v1;

import java.math.BigDecimal;

public class VegetableProducer implements Producer {

	@Override
	public BigDecimal calculateProductPrice(Product product, int quantity) {
		BigDecimal productPrice = null;
		if (Product.VEGETABLE == product) {
			if (quantity > 20) {
				productPrice = BigDecimal.valueOf(3.0d);
			} else {
				productPrice = BigDecimal.valueOf(4.0d);
			}
		}
		return productPrice;
	}
}
