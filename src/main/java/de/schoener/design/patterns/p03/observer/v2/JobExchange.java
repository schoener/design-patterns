package de.schoener.design.patterns.p03.observer.v2;

import java.util.ArrayList;
import java.util.List;

public class JobExchange implements JobProvider {
	private final List<JobObserver> observers = new ArrayList<JobObserver>();
	private final List<Job> jobs = new ArrayList<Job>();

	@Override
	public void addJob(Job job) {
		if (job == null) {
			return;
		}
		this.jobs.add(job);
		observers.forEach(observer -> observer.updateJob(job));
	}

	@Override
	public void addObserver(JobObserver observer) {
		if (observer == null) {
			return;
		}
		this.observers.add(observer);
		this.jobs.forEach(job -> observer.updateJob(job));
	}

	@Override
	public void removeObserver(JobObserver observer) {
		if (observer == null) {
			return;
		}
		this.observers.remove(observer);
	}
}
