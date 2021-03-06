package de.schoener.design.patterns.p12.composite.v1;

public class MainClass {

	public static void main(String[] args) {
		Component composite1 = new Composite("composite1");
		Component composite2 = new Composite("composite2");
		Component composite3 = new Composite("composite3");
		Component leaf1 = new Leaf("leaf1");
		Component leaf2 = new Leaf("leaf2");
		Component leaf3 = new Leaf("leaf3");
		Component leaf4 = new Leaf("leaf4");
		Component leaf5 = new Leaf("leaf5");
		composite2.addComponent(leaf1);
		composite2.addComponent(leaf2);
		composite3.addComponent(leaf3);
		composite3.addComponent(leaf4);
		composite1.addComponent(leaf5);
		composite1.addComponent(composite2);
		composite1.addComponent(composite3);
		//print all components
		composite1.operate(EverythingInclusionFilterFunction.INSTANCE);
		System.out.println();
		//print only
		composite1.operate(LeafFilterFunction.INSTANCE);

	}

}
