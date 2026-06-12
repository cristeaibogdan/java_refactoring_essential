package com.codemanship.refactoring.featureenvy;

class PriceCalculator {

    public double calculateFinalPrice(Product product) {
        double price = product.getPrice();

        if (product.isOnSale()) {
            price = price * 0.8;
        }

        return price;
    }
}
