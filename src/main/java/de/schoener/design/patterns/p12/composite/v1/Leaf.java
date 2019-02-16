package de.schoener.design.patterns.p12.composite.v1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Leaf extends Component {
	private final Logger logger = LoggerFactory.getLogger(Leaf.class);
	private final String name;

	public Leaf(String name) {
		this.name = name;
	}

	@Override
	public ComponentClassification getComponentClassification() {
		return ComponentClassification.LEAF;
	}

	@Override
	protected void internalOperate() {
		logger.info("Leaf with name {}", this.name);
	}

	@Override
	protected void internalOperateForChilds(FilterFunction filterFunction) {
	}

}
