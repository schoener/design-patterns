package de.schoener.design.patterns.p02.templatemethod.v1;

public class MainClass {

	public static void main(String[] args) {
		Printer lowercasePrinter = new LowercasePrinter();
		lowercasePrinter.doPrint();

		Printer uppercasePrinter = new UppercasePrinter();
		uppercasePrinter.doPrint();
	}

}
