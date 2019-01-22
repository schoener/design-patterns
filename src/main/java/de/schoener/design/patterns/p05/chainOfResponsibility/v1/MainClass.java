package de.schoener.design.patterns.p05.chainOfResponsibility.v1;

public class MainClass {

	public static void main(String[] args) {
		Chain chain = new Chain();
		chain.addSeller(new CornerShop());
		chain.addSeller(new GroceryShop());
		chain.addSeller(new WholeSale());
		chain.process(new WholeSalePurchaser());
	}

}
