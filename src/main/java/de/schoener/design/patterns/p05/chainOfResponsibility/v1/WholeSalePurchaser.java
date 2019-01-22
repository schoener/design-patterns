package de.schoener.design.patterns.p05.chainOfResponsibility.v1;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WholeSalePurchaser implements Purchaser {
	private static final Logger logger = LoggerFactory.getLogger(Purchaser.class);

	@Override
	public Product requires() {
		Product[] productValues = Product.values();
		return productValues[new Random().nextInt(productValues.length)];
	}

	@Override
	public void receiveProduct(Product product, int amount) {
		logger.info("Purchaser receives {} piece(s) of product {}", amount, product);
	}

}
