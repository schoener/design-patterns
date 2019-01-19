package de.schoener.design.patterns.p03.observer.v5;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class BeanListener implements PropertyChangeListener {
	private static final Logger logger = LoggerFactory.getLogger(BeanListener.class);

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		logger.info("Value name '{}' with old value {} and new value {} ", evt.getPropertyName(), evt.getOldValue(),
				evt.getNewValue());
	}
}