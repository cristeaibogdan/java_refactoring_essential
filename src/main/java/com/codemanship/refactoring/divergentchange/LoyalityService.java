package com.codemanship.refactoring.divergentchange;

public class LoyalityService {
	public LoyalityService() {
	}

	public int calculateLoyaltyPoints(int numberOfPurchases) {
		return numberOfPurchases * 10;
	}
}