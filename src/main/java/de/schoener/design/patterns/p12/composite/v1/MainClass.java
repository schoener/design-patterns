package de.schoener.design.patterns.p12.composite.v1;

public class MainClass {

	public static void main(String[] args) {
		Component composite1 = new Composite("composite1");
		Component composite2 = new Composite("composite2");
		Component leaf1 = new Leaf("leaf1");
		Component leaf2 = new Leaf("leaf2");
		Component leaf3 = new Leaf("leaf3");
		composite2.addComponent(leaf2);
		composite2.addComponent(leaf3);
		composite1.addComponent(leaf1);
		composite1.addComponent(composite2);
		//print all components
		composite1.operate(EverythingInclusionFilterFunction.INSTANCE);
		System.out.println();
		//print only
		composite1.operate(LeafFilterFunction.INSTANCE);

	}

}
