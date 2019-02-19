package de.schoener.design.patterns.p13.visitor.v1;

public interface Visitor {
	void visit(MailClient mailClient);

	void visit(FtpClient ftpClient);
}
