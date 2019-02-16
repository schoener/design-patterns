package de.schoener.design.patterns.p12.composite.v1;

public class LeafFilterFunction implements FilterFunction {
	public static final FilterFunction INSTANCE = new LeafFilterFunction();

	private LeafFilterFunction() {
	}

	@Override
	public boolean filter(Component component, ComponentClassification classification) {
		return ComponentClassification.LEAF.equals(classification);
	}

}
