package de.schoener.design.patterns.p10.abstractfactory.v1;

public class PolarAreaEnvironmentFactory extends AbstractEnvironmentFactory {

	@Override
	Animal createAnimal() {
		return new IceBear();
	}

	@Override
	Plant createPlant() {
		return new Plat();
	}

	@Override
	Underground createUnderground() {
		return new Ice();
	}

}
