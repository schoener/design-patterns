package de.schoener.design.patterns.p07.command.v3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TextFile {
	private final Logger logger = LoggerFactory.getLogger(TextFile.class);

	public void openFile() {
		logger.info("About to open file");
	}

	public void saveFile() {
		logger.info("About to save file");
	}

}
