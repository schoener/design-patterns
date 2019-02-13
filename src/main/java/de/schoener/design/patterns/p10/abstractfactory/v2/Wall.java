package de.schoener.design.patterns.p10.abstractfactory.v2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Wall implements Component {
	private final Logger logger = LoggerFactory.getLogger(Wall.class);

	@Override
	public String describe() {
		return "wall";

	}

	@Override
	public void enter(Direction direction, Player player) {
		logger.info("you cannot enter a wall");
	}
	
	@Override
	public boolean isOpen() {
		return false;
	}
}
