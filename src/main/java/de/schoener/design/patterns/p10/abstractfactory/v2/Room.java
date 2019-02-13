package de.schoener.design.patterns.p10.abstractfactory.v2;

import java.util.HashMap;
import java.util.Map;

public class Room implements Component {

	private final Map<Direction, Component> currentComponents = new HashMap<>();

	@Override
	public String describe() {
		StringBuilder builder = new StringBuilder();
		currentComponents.entrySet().forEach(action -> {
			builder.append("Direction: '");
			builder.append(action.getKey());
			builder.append("' with component '");
			builder.append(action.getValue());
			builder.append("'.");
		});
		return builder.toString();
	}

	@Override
	public void enter(Direction direction, Player player) {
	}

}
