package com.debug.ex08;

public class CampaignService {

    /**
     * Creates and returns a validated DiscountPolicy for the given promotion request.
     */
    public DiscountPolicy createCampaign(PromotionRequest request) {
        return new DiscountPolicy(request.getCampaignName(), request.getDiscountPercentage());
    }
}
