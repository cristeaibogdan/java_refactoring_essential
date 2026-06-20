package com.codemanship.refactoring.divergentchange;

public class CustomerDisplayFormatter {
	public CustomerDisplayFormatter() {
	}

	public String formatDisplayName(String firstName, String lastName) {
		return firstName.trim() + " " + lastName.trim().toUpperCase();
	}
}