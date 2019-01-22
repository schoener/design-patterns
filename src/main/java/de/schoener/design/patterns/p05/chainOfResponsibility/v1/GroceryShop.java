package de.schoener.design.patterns.p05.chainOfResponsibility.v1;

import java.util.Random;

public class GroceryShop extends AbstractSeller {

	@Override
	public boolean provides(Product product) {
		return new Random().nextInt(10) > 3;
	}

}
