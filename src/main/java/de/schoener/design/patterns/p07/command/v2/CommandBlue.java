package de.schoener.design.patterns.p07.command.v2;

import java.awt.Color;

public class CommandBlue extends AbstractDrawCommand {
	public CommandBlue(CommandHolder undoCommands, CommandHolder redoCommands) {
		super(10, -20, Color.BLUE, undoCommands, redoCommands);
	}

	@Override
	protected int getFirstX() {
		return -1;
	}

	@Override
	protected int getNextX() {
		return -DISTANCE;
	}

	@Override
	public String toString() {
		return "Blue Command";
	}
}
