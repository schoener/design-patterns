package de.schoener.design.patterns.p07.command.v3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TextFile {
	private final Logger logger = LoggerFactory.getLogger(TextFile.class);

	public void openFile() {
		logger.info("About to open file");
	}

	public void closeFile() {
		logger.info("About to close file");
	}

	public void createFile() {
		logger.info("About to create file");
	}

	public void deleteFile() {
		logger.info("About to delete file");
	}

}
