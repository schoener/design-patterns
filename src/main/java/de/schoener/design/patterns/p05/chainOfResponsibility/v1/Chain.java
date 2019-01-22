package de.schoener.design.patterns.p05.chainOfResponsibility.v1;

import java.util.ArrayList;
import java.util.List;

public class Chain {

	List<Seller> sellers = new ArrayList<>();

	public void addSeller(Seller seller) {
		this.sellers.add(seller);
	}

	public void process(Purchaser purchaser) {
		for (Seller seller : sellers) {
			Product product = purchaser.requires();
			if (seller.provides(product)) {
				seller.sellProduct(product, purchaser);
			}
		}
	}
}
