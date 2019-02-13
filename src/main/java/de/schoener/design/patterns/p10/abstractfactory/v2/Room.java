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
			builder.append(action.getValue().describe());
			builder.append("'.");
		});
		return builder.toString();
	}

	@Override
	public void enter(Direction direction, Player player) {
		player.setRoom(this);
	}

	public Component getComponentAt(Direction direction) {
		return currentComponents.get(direction);
	}

	@Override
	public boolean isOpen() {
		return false;
	}

	public void addComponent(Direction direction, Component component) {
		this.currentComponents.put(direction, component);
	}

}
