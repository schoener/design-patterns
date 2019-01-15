package de.schoener.design.patterns.p03.observer.v1;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Student implements JobObserver {
	private static final Logger logger = LoggerFactory.getLogger(Student.class);
	private final String name;

	public Student(String name) {
		this.name = name;
	}

	@Override
	public void updateJob(Job job) {
		if (isCompliantForJob()) {
			logger.info("Student {} would like to apply for a job {} ", name, job);
		}
	}

	private boolean isCompliantForJob() {
		Random random = new Random();
		return random.nextInt(10) > 5;
	}

}
