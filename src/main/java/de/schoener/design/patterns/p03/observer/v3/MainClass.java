package de.schoener.design.patterns.p03.observer.v3;

/**
 * In this sample we use the thread safe solution for Observer pattern.
 * 
 * @author schoener
 *
 */
public class MainClass {
	private JobProvider jobExchange = new JobExchange();
	private Student student = new Student("Hans Meier");

	private class JobProviderObserverSubscriber implements Runnable {
		@Override
		public void run() {
			jobExchange.addObserver(student);
		}
	}

	private class JobProviderObserverUnSubscriber implements Runnable {
		@Override
		public void run() {
			jobExchange.removeObserver(student);
		}
	}

	private class JobProviderEnhancer implements Runnable {
		@Override
		public void run() {
			jobExchange.addJob(new Job("Altenpfleger"));
			jobExchange.addJob(new Job("Maler"));
			jobExchange.addJob(new Job("Mathe-Aushilfe"));
			jobExchange.addJob(new Job("Babysitter"));
		}
	}

	private void run() {
		new Thread(new JobProviderObserverSubscriber()).start();
		new Thread(new JobProviderEnhancer()).start();
		new Thread(new JobProviderObserverUnSubscriber()).start();
	}

	public static void main(String[] args) {
		new MainClass().run();
	}
}
