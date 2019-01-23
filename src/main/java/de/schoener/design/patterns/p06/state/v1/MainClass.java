package de.schoener.design.patterns.p06.state.v1;

public class MainClass {

	public static void main(String[] args) {
		Gate gate = new Gate();
		gate.open();
		gate.unlock();
		gate.close();
		gate.close();
		gate.lock();
		gate.unlock();
		gate.open();
	}

}
