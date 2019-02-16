package de.schoener.design.patterns.p12.composite.v1;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Composite extends Component {
	private final Logger logger = LoggerFactory.getLogger(Composite.class);
	private final String name;
	private final List<Component> childComponents = new ArrayList<>();

	public Composite(String name) {
		this.name = name;
	}

	@Override
	public ComponentClassification getComponentClassification() {
		return ComponentClassification.COMPOSITE;
	}

	@Override
	public void addComponent(Component component) {
		this.childComponents.add(component);
	}

	@Override
	public void removeComponent(Component component) {
		this.childComponents.remove(component);
	}

	@Override
	protected void internalOperate() {
		logger.info("Composite with name {}", this.name);

	}

	@Override
	protected void internalOperateForChilds(FilterFunction filterFunction) {
		for (Component component : childComponents) {
			component.operate(filterFunction);
		}
	}

}
