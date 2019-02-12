package de.schoener.design.patterns.p10.abstractfactory.v1;

public abstract class AbstractEnvironmentFactory {
	abstract Animal createAnimal();

	abstract Plant createPlant();

	abstract Underground createUnderground();
}
