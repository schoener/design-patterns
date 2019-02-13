package de.schoener.design.patterns.p10.abstractfactory.v2;

public class Door implements Component {
	private Room from;
	private Room to;

	@Override
	public String describe() {
		return "door";

	}

	@Override
	public void enter(Direction direction, Player player) {
		Room currentRoom = player.getRoom();
		Room roomToChangeIn = currentRoom.equals(from) ? to : from;
		roomToChangeIn.enter(direction, player);
	}
	
	@Override
	public boolean isOpen() {
		return true;
	}
}
