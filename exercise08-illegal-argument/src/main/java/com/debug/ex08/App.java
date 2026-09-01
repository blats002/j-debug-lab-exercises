package com.debug.ex08;

public class App {
    public static void main(String[] args) {
        CampaignService campaignService = new CampaignService();

        // Solution: Provide a valid percentage value within the domain-accepted range (0.0 to 100.0).
        // Why: DiscountPolicy enforces domain invariants: if percentage is < 0 or > 100, it throws
        // IllegalArgumentException. Passing a valid rate (e.g. 25.0%) respects business rules,
        // and wrapping in try-catch ensures any unexpected runtime argument faults are caught gracefully.
        PromotionRequest request = new PromotionRequest("Summer Super Sale", 25.0);

        try {
            DiscountPolicy policy = campaignService.createCampaign(request);
            System.out.println("Campaign created: " + policy.getCampaignName() + " with rate: " + policy.getDiscountRate());
        } catch (IllegalArgumentException e) {
            System.err.println("Failed to create campaign: " + e.getMessage());
        }
    }
}
