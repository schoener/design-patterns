package de.schoener.design.patterns.p03.observer.v4;

import java.util.Observable;

public class JobExchange extends Observable {
	public void addJob(Job job) {
		if (job == null) {
			return;
		}
		setChanged();
		notifyObservers(job);
	}
}
