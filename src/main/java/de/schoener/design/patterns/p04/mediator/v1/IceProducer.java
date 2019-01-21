package de.schoener.design.patterns.p04.mediator.v1;

import java.math.BigDecimal;

public class IceProducer implements Producer {

	@Override
	public BigDecimal calculateProductPrice(Product product, int quantity) {
		BigDecimal productPrice = null;
		if (Product.ICE == product) {
			if (quantity > 100) {
				productPrice = BigDecimal.valueOf(2.3d);
			} else {
				productPrice = BigDecimal.valueOf(4d);
			}
		}
		return productPrice;
	}
}
