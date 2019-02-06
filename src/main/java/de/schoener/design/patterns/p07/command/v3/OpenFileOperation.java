package de.schoener.design.patterns.p07.command.v3;

public class OpenFileOperation extends BaseFileOperation {

	public OpenFileOperation(TextFile textFile) {
		super(textFile);
	}

	@Override
	public FileOperation undo() {
		return new CloseFileOperation(textFile);
	}

	@Override
	public void execute() {
		this.textFile.openFile();
	}
}
