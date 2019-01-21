package de.schoener.design.patterns.p04.mediator.v1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainClass {

	private static final Logger logger = LoggerFactory.getLogger(MainClass.class);

	public static void main(String[] args) {
		Mediator mediator = new ProductMediator();
		Consumer consumer = new ProductConsumer();
		consumer.registerMediator(mediator);
		Producer iceProducer = new IceProducer();
		Producer meatProducer = new MeatProducer();
		Producer vegetableProducer = new VegetableProducer();
		mediator.registerProducer(iceProducer);
		mediator.registerProducer(meatProducer);
		mediator.registerProducer(vegetableProducer);
		logger.info(String.valueOf(consumer.requestProductPrice(Product.MEAT, 300)));
	}

}
