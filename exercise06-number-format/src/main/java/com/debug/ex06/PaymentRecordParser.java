package com.debug.ex06;

/**
 * PaymentRecordParser handles data transformation, tokenization, and string sanitization
 * for incoming payment records.
 *
 * Core learning objective:
 * Understanding why java.lang.NumberFormatException occurs and how to safely sanitize
 * non-numeric characters before parsing numeric types.
 */
public class PaymentRecordParser {

    /**
     * Parses a raw CSV payment line into a strongly-typed PaymentRecord object.
     *
     * Step-by-step breakdown:
     * 1. Defensive validation: Rejects null or blank input strings.
     * 2. Tokenization: Splits comma-separated values into individual field tokens.
     * 3. Trimming: Removes leading and trailing whitespace from each token.
     * 4. Sanitization: Strips out non-digit formatting characters (such as '$').
     * 5. Conversion: Parses clean numeric string into an integer.
     *
     * @param rawLine raw CSV transaction record (e.g. "TX-10492,$1250,USD")
     * @return a structured PaymentRecord instance
     * @throws IllegalArgumentException if the raw line is null or empty
     */
    public PaymentRecord parse(String rawLine) {
        // Guard clause: Validate that the incoming payload contains data
        if (rawLine == null || rawLine.isBlank()) {
            throw new IllegalArgumentException("Payment line cannot be empty");
        }

        // Split CSV record by comma delimiter
        String[] parts = rawLine.split(",");
        String txId = parts[0].trim();
        String rawAmount = parts[1].trim();
        String currency = parts[2].trim();

        // Solution: Remove the leading '$' currency symbol before parsing the integer amount.
        // Why: Integer.parseInt() expects only numeric digits ('0'-'9'). Passing "$1250" directly throws
        // a java.lang.NumberFormatException because the '$' character is not a valid decimal digit.
        // Using rawAmount.replace("$", "").trim() strips the currency symbol so Integer.parseInt
        // can successfully convert "1250" into the integer 1250.
        String cleanAmount = rawAmount.replace("$", "").trim();
        int amount = Integer.parseInt(cleanAmount);

        // Instantiate and return the domain entity with sanitized values
        return new PaymentRecord(txId, amount, currency);
    }
}
