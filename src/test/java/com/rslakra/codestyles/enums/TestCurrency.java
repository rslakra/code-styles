package com.rslakra.codestyles.enums;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.rslakra.codestyles.enums.Currency;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Rohtash Lakra
 * @created 8/24/20 6:54 PM
 */
public class TestCurrency {

    // LOGGER
    private static final Logger LOGGER = LoggerFactory.getLogger(TestCurrency.class);

    @Test
    public void testCurrency() {
        Currency currency = Currency.INR;
        assertNotNull(currency);
        LOGGER.debug("currency: {}", currency);
    }

}
