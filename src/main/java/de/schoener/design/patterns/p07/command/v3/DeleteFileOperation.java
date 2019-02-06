package de.schoener.design.patterns.p07.command.v3;

public class DeleteFileOperation extends BaseFileOperation {
	public DeleteFileOperation(TextFile textFile) {
		super(textFile);
	}

	@Override
	public FileOperation undo() {
		return new CreateFileOperation(textFile);
	}

	@Override
	public void execute() {
		this.textFile.deleteFile();
	}

}
