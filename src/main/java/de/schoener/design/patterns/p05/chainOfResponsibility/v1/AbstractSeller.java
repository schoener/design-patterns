package de.schoener.design.patterns.p05.chainOfResponsibility.v1;

import java.util.Random;

public abstract class AbstractSeller implements Seller {

	@Override
	public void sellProduct(Product product, Purchaser purchaser) {
		purchaser.receiveProduct(product, new Random().nextInt(100) + 1);
	}

}
