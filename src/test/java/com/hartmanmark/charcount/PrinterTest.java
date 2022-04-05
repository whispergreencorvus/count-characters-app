package com.hartmanmark.charcount;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import com.hartmanmark.charcount.exception.InputDataIsEmptyException;

class PrinterTest {

    private Printer printer = new Printer();

    @Test
    void printResult_shouldPrintResultAsString_whenInputHashMapContains_Abbccc ()
            throws InputDataIsEmptyException {
        String string = "Abbccc ";
        Map<Character, Integer> input = new HashMap<>();
        input.put('A', 1);
        input.put('b', 1);
        input.put('b', 1);
        input.put('c', 1);
        input.put('c', 1);
        input.put('c', 1);
        input.put(' ', 1);
        assertEquals("Abbccc \n"
                + "\" \" - 1\n"
                + "\"A\" - 1\n"
                + "\"b\" - 1\n"
                + "\"c\" - 1\n"
                + "", printer.printResult(input, string));
    }

    @Test
    void printResult_shouldPrintResultAsString_whenInputHashMapContains_0123456()
            throws InputDataIsEmptyException {
        String string = "0123456";
        Map<Character, Integer> input = new HashMap<>();
        input.put('0', 1);
        input.put('1', 1);
        input.put('2', 1);
        input.put('3', 1);
        input.put('4', 1);
        input.put('5', 1);
        input.put('6', 1);
        assertEquals("0123456\n"
                + "\"0\" - 1\n"
                + "\"1\" - 1\n"
                + "\"2\" - 1\n"
                + "\"3\" - 1\n"
                + "\"4\" - 1\n"
                + "\"5\" - 1\n"
                + "\"6\" - 1\n"
                + "", printer.printResult(input, string));
    }

    @Test
    void printResult_shouldPrintResultAsString_whenInputHashMapContains_Symbols()
            throws InputDataIsEmptyException {
        String string = "!@#$%^&";
        Map<Character, Integer> input = new HashMap<>();
        input.put('!', 1);
        input.put('@', 1);
        input.put('#', 1);
        input.put('%', 1);
        input.put('%', 1);
        input.put('^', 1);
        input.put('&', 1);
        assertEquals("!@#$%^&\n"
                + "\"@\" - 1\n"
                + "\"!\" - 1\n"
                + "\"#\" - 1\n"
                + "\"%\" - 1\n"
                + "\"&\" - 1\n"
                + "\"^\" - 1\n"
                + "", printer.printResult(input, string));
    }
}
