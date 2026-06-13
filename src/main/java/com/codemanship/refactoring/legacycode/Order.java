package com.codemanship.refactoring.legacycode;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {

    private final int orderId;
    private final String shippingType;
    private final double weightKg;
    private final double distanceKm;
    private final boolean fragile;

    @JsonCreator
    public Order(
            @JsonProperty("orderId") int orderId,
            @JsonProperty("shippingType") String shippingType,
            @JsonProperty("weightKg") double weightKg,
            @JsonProperty("distanceKm") double distanceKm,
            @JsonProperty("fragile") boolean fragile
    ) {
        this.orderId = orderId;
        this.shippingType = shippingType;
        this.weightKg = weightKg;
        this.distanceKm = distanceKm;
        this.fragile = fragile;
    }

    public int getOrderId() { return orderId; }
    public String getShippingType() { return shippingType; }
    public double getWeightKg() { return weightKg; }
    public double getDistanceKm() { return distanceKm; }
    public boolean isFragile() { return fragile; }
}