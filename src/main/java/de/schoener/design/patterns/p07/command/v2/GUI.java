package de.schoener.design.patterns.p07.command.v2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.border.Border;

public class GUI extends JFrame {
	private class MyListPanel extends JPanel {
		final JList LIST = new JList();

		MyListPanel(String label, ListModel model) {
			this.setBackground(Color.WHITE);
			JLabel lblHeader = new JLabel(label);
			Border paddingBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);

			lblHeader.setBorder(BorderFactory.createCompoundBorder(null, paddingBorder));

			this.setLayout(new BorderLayout());
			this.add("North", lblHeader);
			this.add("Center", LIST);
			LIST.setModel(model);
		}
	}

	private final CommandHolder UNDO_COMMANDS = new CommandHolder();
	private final CommandHolder REDO_COMMANDS = new CommandHolder();
	private AbstractDrawCommand cmdRed = new CommandRed(UNDO_COMMANDS, REDO_COMMANDS);
	private AbstractDrawCommand cmdBlue = new CommandBlue(UNDO_COMMANDS, REDO_COMMANDS);
	private AbstractDrawCommand[] allCommands = new AbstractDrawCommand[] { cmdRed, cmdBlue };

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				GUI frame = new GUI();
				frame.setVisible(true);
			}
		});
	}

	public GUI() {
		// Create buttons
		final JButton BTN_RED = new JButton("Red");
		final JButton BTN_BLUE = new JButton("Blue");
		final JButton BTN_UNDO = new JButton("Undo");
		final JButton BTN_REDO = new JButton("Redo");

		// Create main panel, draw panel and footer panel
		final JPanel MAIN = new JPanel();
		MAIN.setLayout(new BorderLayout());
		final JPanel CANVAS = new JPanel() {
			@Override
			public void paintComponent(Graphics graphics) {
				graphics.setColor(Color.WHITE);
				graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
				for (AbstractDrawCommand tempCommand : allCommands) {
					tempCommand.draw(graphics, this.getWidth(), this.getHeight());
				}
			}
		};
		final JPanel FOOTER = new JPanel();
		FOOTER.add(BTN_RED);
		FOOTER.add(BTN_UNDO);
		FOOTER.add(BTN_REDO);
		FOOTER.add(BTN_BLUE);
		MAIN.add("South", FOOTER);
		MAIN.add("Center", CANVAS);

		// Create undo-list and redo-list
		final MyListPanel UNDO_LIST = new MyListPanel("Liste aller Commands", UNDO_COMMANDS);
		MAIN.add("West", UNDO_LIST);

		final MyListPanel REDO_LIST = new MyListPanel("Liste gel�schter Commands", REDO_COMMANDS);
		MAIN.add("East", REDO_LIST);

		BTN_RED.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				cmdRed.execute();
				CANVAS.repaint();
			}
		});

		BTN_BLUE.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				cmdBlue.execute();
				CANVAS.repaint();
			}
		});

		BTN_UNDO.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				int maxIndex = UNDO_LIST.LIST.getLastVisibleIndex();
				if (maxIndex >= 0) {
					int selIndex = UNDO_LIST.LIST.getSelectedIndex();
					if (selIndex >= 0) {
						maxIndex = selIndex;
						UNDO_LIST.LIST.clearSelection();
					}
					AbstractDrawCommand command = (AbstractDrawCommand) UNDO_LIST.LIST.getModel()
							.getElementAt(maxIndex);
					command.undo();
					CANVAS.repaint();
				}
			}
		});

		BTN_REDO.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				int maxIndex = REDO_LIST.LIST.getLastVisibleIndex();
				if (maxIndex >= 0) {
					int selIndex = REDO_LIST.LIST.getSelectedIndex();
					if (selIndex >= 0) {
						maxIndex = selIndex;
						REDO_LIST.LIST.clearSelection();
					}
					AbstractDrawCommand command = (AbstractDrawCommand) REDO_LIST.LIST.getModel()
							.getElementAt(maxIndex);
					command.redo();
					CANVAS.repaint();
				}
			}
		});

		this.getContentPane().add(MAIN);
		this.setTitle("Command Demo");
		this.setLocationRelativeTo(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
