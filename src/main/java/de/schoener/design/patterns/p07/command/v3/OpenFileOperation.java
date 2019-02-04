package de.schoener.design.patterns.p07.command.v3;

public class OpenFileOperation implements FileOperation {
	private final TextFile textFile;

	public OpenFileOperation(TextFile textFile) {
		this.textFile = textFile;
	}

	@Override
	public void execute() {
		this.textFile.openFile();
	}

}
