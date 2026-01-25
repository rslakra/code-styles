package com.rslakra.codestyles.enums;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.rslakra.codestyles.enums.Country;
import com.rslakra.codestyles.enums.Currency;
import com.rslakra.codestyles.enums.Language;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Rohtash Lakra
 * @created 8/24/20 6:54 PM
 */
public class TestLanguage {

    // LOGGER
    private static final Logger LOGGER = LoggerFactory.getLogger(TestLanguage.class);

    @Test
    public void testLanguage() {
        Language language = Language.EN;
        assertNotNull(language);
        LOGGER.debug("language: {}", language);
    }

}
