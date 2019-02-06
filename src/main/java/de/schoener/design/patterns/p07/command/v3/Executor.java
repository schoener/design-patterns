package de.schoener.design.patterns.p07.command.v3;

import java.util.ArrayList;
import java.util.List;

public class Executor {
	private final List<FileOperation> textFileOperations = new ArrayList<>();

	public void executeOperation(FileOperation fileOperation) {
		textFileOperations.add(fileOperation);
		fileOperation.execute();
	}

	public void undoOperation() {
		if (!textFileOperations.isEmpty()) {
			FileOperation operationToUndo = textFileOperations.remove(textFileOperations.size() - 1);
			FileOperation operationToExecute = operationToUndo.undo();
			operationToExecute.execute();
		}
	}
}
