package de.schoener.design.patterns.p06.state.v1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public enum State implements Stateable {

	OPENED {
		private final Logger logger = LoggerFactory.getLogger(State.class);

		@Override
		public Stateable open() {
			logger.info("Already in state open");
			return this;
		}

		@Override
		public Stateable close() {
			logger.info("About to close");
			return State.CLOSED;
		}

		@Override
		public Stateable lock() {
			logger.info("In state open cannot lock");
			return this;
		}

		@Override
		public Stateable unlock() {
			logger.info("In state open cannot unlock");
			return this;
		}
	},
	CLOSED {
		private final Logger logger = LoggerFactory.getLogger(State.class);

		@Override
		public Stateable open() {
			logger.info("About to open");
			return State.OPENED;
		}

		@Override
		public Stateable close() {
			logger.info("Already in state closed ");
			return this;
		}

		@Override
		public Stateable lock() {
			logger.info("About to lock");
			return State.LOCKED;
		}

		@Override
		public Stateable unlock() {
			logger.info("In state closed cannot unlock");
			return this;
		}
	},
	LOCKED {
		private final Logger logger = LoggerFactory.getLogger(State.class);

		@Override
		public Stateable open() {
			logger.info("In state locked cannot open");
			return this;
		}

		@Override
		public Stateable close() {
			logger.info("In state locked cannot close");
			return this;
		}

		@Override
		public Stateable lock() {
			logger.info("Already locked");
			return this;
		}

		@Override
		public Stateable unlock() {
			logger.info("About to unlock");
			return State.CLOSED;
		}
	};

}
