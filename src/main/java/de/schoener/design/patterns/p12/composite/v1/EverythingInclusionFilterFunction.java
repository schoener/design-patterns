package de.schoener.design.patterns.p12.composite.v1;

public class EverythingInclusionFilterFunction implements FilterFunction {
	public static final FilterFunction INSTANCE = new EverythingInclusionFilterFunction();

	private EverythingInclusionFilterFunction() {
	}

	@Override
	public boolean filter(Component component, ComponentClassification classification) {
		return true;
	}

}
