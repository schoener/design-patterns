package de.schoener.design.patterns.p05.chainOfResponsibility.v1;

public interface Purchaser {
	Product requires();

	void receiveProduct(Product product, int amount);
}
