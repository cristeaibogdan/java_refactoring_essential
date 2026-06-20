package com.codemanship.refactoring.divergentchange;

public class CustomerService {

	private final EmailValidator emailValidator = new EmailValidator();
	private final CustomerDisplayFormatter customerDisplayFormatter = new CustomerDisplayFormatter();
	private final LoyalityService loyalityService = new LoyalityService();

	public boolean isValidEmail(String email) {
		return emailValidator.isValidEmail(email);
	}

    public String formatDisplayName(String firstName, String lastName) {
		return customerDisplayFormatter.formatDisplayName(firstName, lastName);
	}

    public int calculateLoyaltyPoints(int numberOfPurchases) {
		return loyalityService.calculateLoyaltyPoints(numberOfPurchases);
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
