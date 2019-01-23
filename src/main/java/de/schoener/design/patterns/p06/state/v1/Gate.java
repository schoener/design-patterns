package de.schoener.design.patterns.p06.state.v1;

public class Gate {

	private Stateable state = State.OPENED;

	void open() {
		this.state = this.state.open();
	}

	void close() {
		this.state = this.state.close();
	}

	void lock() {
		this.state = this.state.lock();
	}

	void unlock() {
		this.state = this.state.unlock();
	}
}
