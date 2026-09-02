package com.debug.ex06;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentRecordParserTest {

    @Test
    @DisplayName("Verify clean numeric payment line parses correctly")
    void testCleanPaymentParsing() {
        PaymentRecordParser parser = new PaymentRecordParser();
        PaymentRecord record = parser.parse("TX-1001,500,USD");

        assertNotNull(record);
        assertEquals("TX-1001", record.getTransactionId());
        assertEquals(500, record.getAmountInDollars());
        assertEquals("USD", record.getCurrency());
    }

    @Test
    @DisplayName("Verify formatted currency string with dollar sign parses without NumberFormatException")
    void testFormattedCurrencyParsing() {
        PaymentRecordParser parser = new PaymentRecordParser();
        
        assertDoesNotThrow(() -> {
            PaymentRecord record = parser.parse("TX-1002,$1250,USD");
            assertEquals(1250, record.getAmountInDollars());
        }, "Parser should handle formatted currency symbols without throwing NumberFormatException");
    }

    @Test
    @DisplayName("Verify App.main executes successfully without throwing NumberFormatException")
    void testAppMain() {
        assertDoesNotThrow(() -> App.main(new String[0]), 
            "App.main should parse transaction feed without throwing NumberFormatException");
    }
}
