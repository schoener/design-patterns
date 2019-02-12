package de.schoener.design.patterns.p10.abstractfactory.v1;

public class MainClass {

	public static void main(String[] args) {
		AbstractEnvironmentFactory desertFactory = new ConcreteFactoryProducer().createFactory(Environment.DESERT);
		Animal elephant = desertFactory.createAnimal();
		AbstractEnvironmentFactory polarAreaFactory= new ConcreteFactoryProducer().createFactory(Environment.POLAR_AREA);
		Underground ice = polarAreaFactory.createUnderground();
	}

}
