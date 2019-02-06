package de.schoener.design.patterns.p08.strategy.v1;

import java.math.BigDecimal;

public class MainClass {
	public static void main(String[] args) {
		Context contextOne = new Context(new ChristmasDiscounter());
		contextOne.applyDiscount(BigDecimal.valueOf(100));
		//
		Context contextTwo = new Context(new EasterDiscounter());
		contextTwo.applyDiscount(BigDecimal.valueOf(100));
	}
}
