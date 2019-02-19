package de.schoener.design.patterns.p13.visitor.v1;

import java.util.Arrays;
import java.util.List;

public class ClientService {
	void visitClients() {
		List<Visitable> visitables = Arrays.asList(new FtpClient("ftp-client"), new MailClient("mail-client"));
		visitables.forEach(visitable -> visitable.accept(new ConcreteClientVisitor()));
	}
}
