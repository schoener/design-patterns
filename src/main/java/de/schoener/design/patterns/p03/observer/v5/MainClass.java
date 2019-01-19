package de.schoener.design.patterns.p03.observer.v5;

import java.util.Random;

/**
 * In this sample the java.util classes are used.
 * {@link java.beans.PropertyChangeListener} and
 * {@link java.beans.PropertyChangeSupport}
 * 
 * @author schoener
 *
 */
public class MainClass {

	public static void main(String[] args) {
		Bean bean = new Bean();
		bean.addPropertyChangeListener(new BeanListener());
		bean.setValue(String.valueOf(new Random().nextInt(10)));
		bean.setValue(String.valueOf(new Random().nextInt(10)));
		bean.setValue(String.valueOf(new Random().nextInt(10)));
		bean.setValue(String.valueOf(new Random().nextInt(10)));
	}
}
