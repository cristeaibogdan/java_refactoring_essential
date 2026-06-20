package com.codemanship.refactoring.divergentchange;

public class CustomerService {

	private final EmailValidator emailValidator = new EmailValidator();

	public boolean isValidEmail(String email) {
		return emailValidator.isValidEmail(email);
	}

    public String formatDisplayName(String firstName, String lastName) {
        return firstName.trim() + " " + lastName.trim().toUpperCase();
    }

    public int calculateLoyaltyPoints(int numberOfPurchases) {
        return numberOfPurchases * 10;
    }

    public String determineAccountStatus(int daysSinceLastLogin) {
        if (daysSinceLastLogin > 365) {
            return "INACTIVE";
        } else if (daysSinceLastLogin > 30) {
            return "DORMANT";
        }
        return "ACTIVE";
    }
}
