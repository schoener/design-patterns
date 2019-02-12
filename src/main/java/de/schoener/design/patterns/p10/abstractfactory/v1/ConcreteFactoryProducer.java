package de.schoener.design.patterns.p10.abstractfactory.v1;

public class ConcreteFactoryProducer {

	AbstractEnvironmentFactory createFactory(Environment environment) {
		AbstractEnvironmentFactory environmentFactory = null;
		switch (environment) {
		case POLAR_AREA:
			environmentFactory = new PolarAreaEnvironmentFactory();
			break;
		case DESERT:
			environmentFactory = new DesertEnvironmentFactory();
			break;
		default:
			throw new IllegalArgumentException("No corresponding environment factory will be created");
		}
		return environmentFactory;
	}
}
