package de.schoener.design.patterns.p07.command.v3;

public class SaveFileOperation implements FileOperation {
	private final TextFile textFile;

	public SaveFileOperation(TextFile textFile) {
		this.textFile = textFile;
	}

	@Override
	public void execute() {
		this.textFile.saveFile();
	}

}
