package de.schoener.design.patterns.p11.factorymethod.v1;

public class LowerCaseProcessorCreator extends AbstractCreator {

	@Override
	protected Processor createProcessor() {
		return new LowerCaseProcessor();
	}

}
