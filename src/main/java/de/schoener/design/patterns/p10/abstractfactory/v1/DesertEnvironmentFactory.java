package de.schoener.design.patterns.p10.abstractfactory.v1;

public class DesertEnvironmentFactory extends AbstractEnvironmentFactory {

	@Override
	Animal createAnimal() {
		return new Elephant();
	}

	@Override
	Plant createPlant() {
		return new Cactus();
	}

	@Override
	Underground createUnderground() {
		return new Sand();
	}

}
