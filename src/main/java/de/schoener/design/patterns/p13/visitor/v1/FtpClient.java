package de.schoener.design.patterns.p13.visitor.v1;

public class FtpClient implements Visitable {
	private final String name;

	public FtpClient(String name) {
		this.name = name;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String getName() {
		return name;
	}
}
