package de.schoener.design.patterns.p05.chainOfResponsibility.v1;

public class WholeSale extends AbstractSeller {

	@Override
	public boolean provides(Product product) {
		return true;
	}

}
