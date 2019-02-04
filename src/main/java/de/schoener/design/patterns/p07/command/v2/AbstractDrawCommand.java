package de.schoener.design.patterns.p07.command.v2;

import java.awt.Color;
import java.awt.Graphics;

public abstract class AbstractDrawCommand {
	private final CommandHolder UNDO_COMMANDS;
	private final CommandHolder REDO_COMMANDS;
	private int commandCount = 0;
	protected final int DISTANCE;
	protected final int NEIGUNG;
	protected final Color COLOR;

	public AbstractDrawCommand(int abstand, int neigung, Color color, CommandHolder undoCommands,
			CommandHolder redoCommands) {
		this.DISTANCE = abstand;
		this.NEIGUNG = neigung;
		this.COLOR = color;
		UNDO_COMMANDS = undoCommands;
		REDO_COMMANDS = redoCommands;
	}

	protected abstract int getFirstX();

	protected abstract int getNextX();

	public void execute() {
		commandCount++;
		UNDO_COMMANDS.add(this);
	}

	public void redo() {
		execute();
		REDO_COMMANDS.remove(this);
	}

	public void undo() {
		commandCount--;
		UNDO_COMMANDS.remove(this);
		REDO_COMMANDS.add(this);
	}

	public void draw(Graphics graphics, int width, int height) {
		graphics.setColor(COLOR);
		int tempX = getFirstX();
		if (tempX < 0) {
			tempX = width;
		}

		for (int i = 0; i < commandCount; i++) {
			graphics.drawLine(tempX, 0, tempX + NEIGUNG, height);
			tempX += getNextX();
		}
	}
}
