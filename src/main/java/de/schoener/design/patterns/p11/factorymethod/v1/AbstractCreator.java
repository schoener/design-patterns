package de.schoener.design.patterns.p11.factorymethod.v1;

public abstract class AbstractCreator {

	protected abstract Processor createProcessor();

	public void createProduct() {
		Processor processor = createProcessor();
		processor.process("YaHoo");
	}
}
