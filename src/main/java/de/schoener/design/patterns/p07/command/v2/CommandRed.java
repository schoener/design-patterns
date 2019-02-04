package de.schoener.design.patterns.p07.command.v2;

import java.awt.Color;

public class CommandRed extends AbstractDrawCommand {
	public CommandRed(CommandHolder undoCommands, CommandHolder redoCommands) {
		super(10, 20, Color.RED, undoCommands, redoCommands);
	}

	@Override
	protected int getFirstX() {
		return 0;
	}

	@Override
	protected int getNextX() {
		return DISTANCE;
	}

	@Override
	public String toString() {
		return "Red-Command";
	}
}
