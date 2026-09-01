package com.debug.ex08;

public class App {
    public static void main(String[] args) {
        CampaignService campaignService = new CampaignService();
        PromotionRequest request = new PromotionRequest("Summer Super Sale", 150.0);

        DiscountPolicy policy = campaignService.createCampaign(request);
        System.out.println("Campaign created: " + policy.getCampaignName() + " with rate: " + policy.getDiscountRate());
    }
}
