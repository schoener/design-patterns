package de.schoener.design.patterns.p12.composite.v1;

public interface FilterFunction {
	boolean filter(Component component, ComponentClassification classification);
}
