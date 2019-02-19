package de.schoener.design.patterns.p13.visitor.v1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteClientVisitor implements Visitor {
	private final Logger logger = LoggerFactory.getLogger(ConcreteClientVisitor.class);

	@Override
	public void visit(MailClient mailClient) {
		logger.info("visited {}", mailClient.getName());
	}

	@Override
	public void visit(FtpClient ftpClient) {
		logger.info("visited {}", ftpClient.getName());
	}

}
