package de.schoener.design.patterns.p03.observer.v4;

/**
 * In this sample the java.util classes are used. {@link java.util.Observer} and
 * {@link java.util.Observable}
 * 
 * @author schoener
 *
 */
public class MainClass {
	public static void main(String[] args) {
		JobExchange jobExchange = new JobExchange();
		Student student = new Student("Hans Meier");
		jobExchange.addObserver(student);
		jobExchange.addJob(new Job("Altenpfleger"));
		jobExchange.addJob(new Job("Maler"));
		jobExchange.addJob(new Job("Mathe-Aushilfe"));
		jobExchange.addJob(new Job("Babysitter"));
	}
}
