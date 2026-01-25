package com.rslakra.codestyles.enums;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.rslakra.codestyles.enums.Country;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Rohtash Lakra
 * @created 8/24/20 6:54 PM
 */
public class TestCountry {

    // LOGGER
    private static final Logger LOGGER = LoggerFactory.getLogger(TestCountry.class);

    @Test
    public void testCountry() {
        Country country = Country.IN;
        assertNotNull(country);
        LOGGER.debug("country: {}", country);
    }

}
