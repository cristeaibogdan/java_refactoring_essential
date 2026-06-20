package com.codemanship.refactoring.longmethod;

import java.util.List;

public class Order {

	public static final double TAX_RATE = 0.20;
	private final List<OrderItem> items;
    private final Customer customer;

    public Order(List<OrderItem> items, Customer customer) {
        this.items = items;
        this.customer = customer;
    }

    public OrderSummary summarise() {
		validateItems();

		double subtotal = calculateSubtotal();

		double discount = calculateDiscount(subtotal);

        double taxableAmount = subtotal - discount;
		double tax = taxableAmount * TAX_RATE;

        double total = taxableAmount + tax;

        return new OrderSummary(subtotal, discount, tax, total);
    }

	private void validateItems() {
		if (items == null) {
			throw new IllegalStateException("Items cannot be null");
		}
		if (items.isEmpty()) {
			throw new IllegalStateException("Order must contain items");
		}
	}

	private double calculateDiscount(double subtotal) {
		double discount = 0.0;
		if (customer.isLoyal()) {
			discount = subtotal * 0.10;
		} else if (subtotal > 100) {
			discount = subtotal * 0.05;
		}
		return discount;
	}

	private double calculateSubtotal() {
		double subtotal = 0.0;
		for (OrderItem item : items) {
			subtotal += item.calculateTotal();
		}
		return subtotal;
	}

}
