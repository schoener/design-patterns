package de.schoener.design.patterns.p10.abstractfactory.v2;

public class Player {

	private Room room;

	public Player(Room room) {
		this.room = room;
	}

	public Room getRoom() {
		return this.room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

}
