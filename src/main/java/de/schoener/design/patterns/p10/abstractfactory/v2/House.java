package de.schoener.design.patterns.p10.abstractfactory.v2;

import java.io.IOException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class House {
	private static final Logger logger = LoggerFactory.getLogger(House.class);

	public static void main(String[] args) throws IOException {
		Room room = new Room();
		room.addComponent(Direction.SOUTH, new Wall());
		Player player = new Player(room);
		
		logger.info("print your choice:");
		String readLine = "";
		while (readLine != null) {
			Scanner scanner = new Scanner(System.in);
			readLine = scanner.nextLine();
			if ("exit".equals(readLine)) {
				new ExitCommand().process(null, null);
			} else if ("description".equals(readLine)) {
				new DescriptionCommand().process(null, player);
			}
		}
	}

	interface Command {
		void process(Direction direction, Player player);
	}

	static class DescriptionCommand implements Command {

		@Override
		public void process(Direction direction, Player player) {
			Room currentRoom = player.getRoom();
			logger.info(currentRoom.describe());
		}
	}

	static class ExitCommand implements Command {

		@Override
		public void process(Direction direction, Player player) {
			logger.info("will exit the application");
			System.exit(0);
		}

	}

}
