package com.hartmanmark.charcount;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.hartmanmark.charcount.exception.InputDataIsEmptyException;

class CharCounterValidatorTest {

    private CharCounterValidator charCounterValidator;

    @BeforeEach
    void init() {
        charCounterValidator = new CharCounterValidator();
    }

    @Test
    void testVerify_shouldGetNumberFormatException_whenInputStringContainsNull() {
        Throwable exception = assertThrows(NumberFormatException.class, () -> {
            charCounterValidator.verify(null);
        });
        assertEquals("Input data is null", exception.getMessage());
    }

    @Test
    void testVerify_shouldGetInputDataIsEmptyException_whenInputStringIsEmpty() {
        Throwable exception = assertThrows(InputDataIsEmptyException.class, () -> {
            charCounterValidator.verify("");
        });
        assertEquals("Input string is empty. Try again. For output input [exit]", exception.getMessage());
    }
}
