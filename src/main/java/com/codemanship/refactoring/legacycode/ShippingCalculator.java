package com.codemanship.refactoring.legacycode;

public class ShippingCalculator {

	private OrderRepository orderRepository;

	public ShippingCalculator(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	public double calculateShipping(int orderId) {

        try {
			orderRepository = new OrderRepository();
			Order order = orderRepository.loadOrder(orderId);

			switch (order.getShippingType()) {

                case "STANDARD":
                    return order.getWeightKg() * 0.5;

                case "EXPRESS":
                    return order.getWeightKg() * 0.8
                            + order.getDistanceKm() * 0.1;

                case "OVERNIGHT":
                    return order.getWeightKg() * 1.2 + 25;

                default:
                    throw new RuntimeException(
                            "Unknown shipping type: "
                                    + order.getShippingType()
                    );
            }

        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }

}
