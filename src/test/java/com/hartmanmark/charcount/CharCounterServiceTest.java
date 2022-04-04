package com.hartmanmark.charcount;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.hartmanmark.charcount.exception.InputDataIsEmptyException;

class CharCounterServiceTest {

    private CharCounter charCounter = new CharCounter();
    private CharCounterService charCounterService = new CharCounterService(charCounter);

    @Test
    void testCharCount_shouldCountCharactersInInputString_whenInputStringContains_HelloWorld() throws InputDataIsEmptyException {
        String inputString = "Hello World";
        assertEquals("Hello World\n"
                + "\" \" - 1\n"
                + "\"r\" - 1\n"
                + "\"d\" - 1\n"
                + "\"e\" - 1\n"
                + "\"W\" - 1\n"
                + "\"H\" - 1\n"
                + "\"l\" - 3\n"
                + "\"o\" - 2\n"
                + "", charCounterService.charCount(inputString));
    }

    @Test
    void testCharCount_shouldCountCharactersInInputString_whenInputStringContains_Symbols() throws InputDataIsEmptyException {
        String inputString = "!@#$%^&*()$%^&((||";
        assertEquals("!@#$%^&*()$%^&((||\n"
                + "\"@\" - 1\n"
                + "\"!\" - 1\n"
                + "\"#\" - 1\n"
                + "\"$\" - 2\n"
                + "\"%\" - 2\n"
                + "\"&\" - 2\n"
                + "\"(\" - 3\n"
                + "\")\" - 1\n"
                + "\"*\" - 1\n"
                + "\"|\" - 2\n"
                + "\"^\" - 2\n"
                + "", charCounterService.charCount(inputString));
    }

    @Test
    void testCharCount_shouldCountCharactersInInputString_whenInputStringContains_Spaces() throws InputDataIsEmptyException {
        String inputString = "           ";
        assertEquals("           \n"
                + "\" \" - 11\n"
                + "", charCounterService.charCount(inputString));
    }
}
