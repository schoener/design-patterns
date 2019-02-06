package de.schoener.design.patterns.p07.command.v3;

public class CreateFileOperation extends BaseFileOperation {
	public CreateFileOperation(TextFile textFile) {
		super(textFile);
	}

	@Override
	public FileOperation undo() {
		return new DeleteFileOperation(textFile);
	}

	@Override
	public void execute() {
		this.textFile.createFile();
	}
}
