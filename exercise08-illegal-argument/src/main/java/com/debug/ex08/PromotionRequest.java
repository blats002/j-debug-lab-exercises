package com.debug.ex08;

public class PromotionRequest {
    private final String campaignName;
    private final double discountPercentage;

    public PromotionRequest(String campaignName, double discountPercentage) {
        this.campaignName = campaignName;
        this.discountPercentage = discountPercentage;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }
}
