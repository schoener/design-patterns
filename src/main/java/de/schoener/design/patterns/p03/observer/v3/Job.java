package de.schoener.design.patterns.p03.observer.v3;

public class Job {
	private final String description;
	private boolean valid = true;
	
	public Job(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	@Override
	public String toString() {
		return "Job [description=" + description + ", valid=" + valid + "]";
	}
}
