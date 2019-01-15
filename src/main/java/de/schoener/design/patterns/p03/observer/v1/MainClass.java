package de.schoener.design.patterns.p03.observer.v1;

public class MainClass {
	public static void main(String[] args) {
		JobExchange jobExchange = new JobExchange();
		jobExchange.addObserver(new Student("Hans Meier"));
		jobExchange.addJob(new Job("Altenpfleger"));
		jobExchange.addJob(new Job("Maler"));
		jobExchange.addJob(new Job("Mathe-Aushilfe"));
		jobExchange.addJob(new Job("Babysitter"));
	}
}
