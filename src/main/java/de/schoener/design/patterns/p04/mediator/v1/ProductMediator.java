package de.schoener.design.patterns.p04.mediator.v1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ProductMediator implements Mediator {
	List<Producer> producers = new ArrayList<>();

	@Override
	public void registerProducer(Producer producer) {
		producers.add(producer);
	}

	@Override
	public BigDecimal calculateProductPrice(Product product, int quantity) {
		List<BigDecimal> calculatedProductPrices = producers.stream()
				.map(p -> p.calculateProductPrice(product, quantity)).filter(Objects::nonNull)
				.collect(Collectors.toList());
		return calculatedProductPrices.stream().min(Comparator.naturalOrder()).get();
	}

}
