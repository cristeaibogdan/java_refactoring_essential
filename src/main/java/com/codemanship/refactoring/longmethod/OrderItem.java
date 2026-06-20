package com.codemanship.refactoring.longmethod;

public class OrderItem {
    private final double price;
    private final double quantity;

    public OrderItem(double price, double quantity) {
        this.price = price;
        this.quantity = quantity;
    }

	double calculateTotal() {
		return this.price * this.quantity;
	}
}
