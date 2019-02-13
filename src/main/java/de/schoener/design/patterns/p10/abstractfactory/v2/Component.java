package de.schoener.design.patterns.p10.abstractfactory.v2;

public interface Component {
	String describe();

	void enter(Direction direction, Player player);
	
	boolean isOpen();
}
