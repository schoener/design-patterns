package de.schoener.design.patterns.p03.observer.v2;

public interface JobProvider {
	void addObserver(JobObserver observer);

	void removeObserver(JobObserver observer);

	void addJob(Job job);
}
