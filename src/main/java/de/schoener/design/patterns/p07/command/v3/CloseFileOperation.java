package de.schoener.design.patterns.p07.command.v3;

public class CloseFileOperation extends BaseFileOperation {

	public CloseFileOperation(TextFile textFile) {
		super(textFile);
	}

	@Override
	public FileOperation undo() {
		return new OpenFileOperation(textFile);
	}

	@Override
	public void execute() {
		this.textFile.closeFile();
	}

}
