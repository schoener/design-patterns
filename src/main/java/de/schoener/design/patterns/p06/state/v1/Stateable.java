package de.schoener.design.patterns.p06.state.v1;

public interface Stateable {
	Stateable open();

	Stateable close();

	Stateable lock();

	Stateable unlock();
}
