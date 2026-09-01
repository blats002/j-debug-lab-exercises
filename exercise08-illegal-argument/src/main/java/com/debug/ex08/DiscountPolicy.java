package com.debug.ex08;

public class DiscountPolicy {
    private final String campaignName;
    private final double discountRate;

    public DiscountPolicy(String campaignName, double discountPercentage) {
        if (discountPercentage < 0.0 || discountPercentage > 100.0) {
            throw new IllegalArgumentException(
                "Discount percentage must be between 0.0 and 100.0 (received: " + discountPercentage + "%)"
            );
        }
        this.campaignName = campaignName;
        this.discountRate = discountPercentage / 100.0;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public double getDiscountRate() {
        return discountRate;
    }
}
