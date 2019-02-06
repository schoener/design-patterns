package de.schoener.design.patterns.p07.command.v3;

public abstract class BaseFileOperation implements FileOperation {
	protected final TextFile textFile;

	public BaseFileOperation(TextFile textFile) {
		this.textFile = textFile;
	}

	public abstract void execute();

	public abstract FileOperation undo();
}
