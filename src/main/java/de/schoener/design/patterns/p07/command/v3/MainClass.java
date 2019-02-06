package de.schoener.design.patterns.p07.command.v3;

public class MainClass {

	public static void main(String[] args) {
		Executor executor = new Executor();
		TextFile textFile = new TextFile();

		OpenFileOperation openFileOperation = new OpenFileOperation(textFile);

		executor.executeOperation(openFileOperation);
		executor.undoOperation();
	}

}
