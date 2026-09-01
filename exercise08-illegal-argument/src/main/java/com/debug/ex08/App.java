package com.debug.ex08;

public class App {
    public static void main(String[] args) {
        CampaignService campaignService = new CampaignService();

        // Valid promotion request with 25.0% discount
        PromotionRequest request = new PromotionRequest("Summer Super Sale", 25.0);

        try {
            DiscountPolicy policy = campaignService.createCampaign(request);
            System.out.println("Campaign created: " + policy.getCampaignName() + " with rate: " + policy.getDiscountRate());
        } catch (IllegalArgumentException e) {
            System.err.println("Failed to create campaign: " + e.getMessage());
        }
    }
}
