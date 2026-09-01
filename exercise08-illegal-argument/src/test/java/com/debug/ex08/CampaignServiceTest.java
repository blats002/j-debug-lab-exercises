package com.debug.ex08;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CampaignServiceTest {

    @Test
    @DisplayName("Verify valid discount percentages are accepted")
    void testValidPercentages() {
        CampaignService service = new CampaignService();

        DiscountPolicy minPolicy = service.createCampaign(new PromotionRequest("Min Campaign", 0.0));
        assertEquals(0.0, minPolicy.getDiscountRate(), 0.0001);

        DiscountPolicy midPolicy = service.createCampaign(new PromotionRequest("Mid Campaign", 50.0));
        assertEquals(0.5, midPolicy.getDiscountRate(), 0.0001);

        DiscountPolicy maxPolicy = service.createCampaign(new PromotionRequest("Max Campaign", 100.0));
        assertEquals(1.0, maxPolicy.getDiscountRate(), 0.0001);
    }

    @Test
    @DisplayName("Verify invalid discount percentages throw IllegalArgumentException")
    void testInvalidPercentages() {
        CampaignService service = new CampaignService();

        assertThrows(IllegalArgumentException.class, 
            () -> service.createCampaign(new PromotionRequest("Negative Discount", -10.0)),
            "Negative discount percentage must throw IllegalArgumentException");

        assertThrows(IllegalArgumentException.class, 
            () -> service.createCampaign(new PromotionRequest("Excessive Discount", 150.0)),
            "Discount percentage exceeding 100% must throw IllegalArgumentException");
    }

    @Test
    @DisplayName("Verify App.main executes successfully without throwing IllegalArgumentException")
    void testAppMain() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should validate input or configure a valid promotion percentage without crashing");
    }
}
