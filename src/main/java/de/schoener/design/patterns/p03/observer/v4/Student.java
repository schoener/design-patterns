package de.schoener.design.patterns.p03.observer.v4;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Student implements Observer {
	private static final Logger logger = LoggerFactory.getLogger(Student.class);
	private final String name;

	public Student(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		if (isCompliantForJob() && Job.class.getName() == arg.getClass().getName()) {
			Job job = (Job) arg;
			logger.info("Student {} would like to apply for a job {} ", name, job);
		}
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.name).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return new EqualsBuilder().append(name, other.name).build();
	}

	private boolean isCompliantForJob() {
		Random random = new Random();
		return random.nextInt(10) > 5;
	}
}
