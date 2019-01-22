package de.schoener.design.patterns.p05.chainOfResponsibility.v1;

public interface Seller {
	boolean provides(Product product);

	void sellProduct(Product product, Purchaser purchaser);
}
