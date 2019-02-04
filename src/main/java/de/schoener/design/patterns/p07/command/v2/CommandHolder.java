package de.schoener.design.patterns.p07.command.v2;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ListModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

public class CommandHolder implements ListModel {
	private final List<AbstractDrawCommand> COMMAND_LIST = new ArrayList<>();
	private final List<ListDataListener> LISTENER = new ArrayList<>();

	void remove(AbstractDrawCommand temp) {
		COMMAND_LIST.remove(temp);
		for (ListDataListener tempListener : LISTENER) {
			ListDataEvent event = new ListDataEvent(this, ListDataEvent.CONTENTS_CHANGED, 0, COMMAND_LIST.size() - 1);
			tempListener.contentsChanged(event);
		}
	}

	void add(AbstractDrawCommand temp) {
		COMMAND_LIST.add(temp);
		for (ListDataListener tempListener : LISTENER) {
			ListDataEvent event = new ListDataEvent(this, ListDataEvent.CONTENTS_CHANGED, 0, COMMAND_LIST.size() - 1);
			tempListener.contentsChanged(event);
		}
	}

	@Override
	public Object getElementAt(int index) {
		return COMMAND_LIST.get(index);
	}

	@Override
	public int getSize() {
		return COMMAND_LIST.size();
	}

	@Override
	public void addListDataListener(ListDataListener listener) {
		LISTENER.add(listener);
	}

	@Override
	public void removeListDataListener(ListDataListener listener) {
		LISTENER.remove(listener);
	}
}
