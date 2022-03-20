package com.github.hcsp.polymorphism;

public class PriceCalculator {
    public static int calculatePrice(DiscountStrategy strategy, int price, User user) {
        return strategy.discount(price, user);
    }
}
