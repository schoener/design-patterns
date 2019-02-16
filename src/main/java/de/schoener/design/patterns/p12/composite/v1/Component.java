package de.schoener.design.patterns.p12.composite.v1;

public abstract class Component {

	public final void operate(FilterFunction filterFunction) {
		if (filterFunction.filter(this, getComponentClassification())) {
			internalOperate();
		}
		internalOperateForChilds(filterFunction);
	}

	protected abstract void internalOperate();

	protected abstract void internalOperateForChilds(FilterFunction filterFunction);

	public abstract ComponentClassification getComponentClassification();

	public void addComponent(Component component) {
		throw new UnsupportedOperationException("add component not supported");
	}

	public void removeComponent(Component component) {
		throw new UnsupportedOperationException("remove component not supported");
	}
}
