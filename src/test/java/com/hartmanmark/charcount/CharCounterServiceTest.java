package com.hartmanmark.charcount;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.hartmanmark.charcount.exception.InputDataIsEmptyException;

class CharCounterServiceTest {

    private CharCounter charCounter = new CharCounter();
    private Cache cache = new Cache();
    private CharCounterService charCounterService = new CharCounterService(charCounter, cache);

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
    void testCharCount_shouldCountCharactersInInputString_whenInputStringContains_1234567890() throws InputDataIsEmptyException {
        String inputString = "1234567890";
        assertEquals("1234567890\n"
                + "\"0\" - 1\n"
                + "\"1\" - 1\n"
                + "\"2\" - 1\n"
                + "\"3\" - 1\n"
                + "\"4\" - 1\n"
                + "\"5\" - 1\n"
                + "\"6\" - 1\n"
                + "\"7\" - 1\n"
                + "\"8\" - 1\n"
                + "\"9\" - 1\n"
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
