package com.hartmanmark.charcount;

import java.util.HashMap;
import java.util.Map;

import com.hartmanmark.charcount.exception.InputDataIsEmptyException;
import com.hartmanmark.charcount.exception.InputDataIsNullException;

public class CharCounterService {

    private Printer printer = new Printer();
    private Cache cache = new Cache();
    private CharCounterValidator charCounterValidator = new CharCounterValidator();

    private String inputString;

    public void charCount(String inputString) throws InputDataIsEmptyException, InputDataIsNullException {
        charCounterValidator.verify(inputString);
        checkContainsInputStringInCache(inputString);
    }

    public Map<Character, Integer> countNumbersOfCharInString(String inputString) {
        char symbol;
        Integer numberOfSymbol;
        Map<Character, Integer> countMap = new HashMap<>();
        char[] inputStringAsCharArray = inputString.toCharArray();
        for (int j = 0; j < inputStringAsCharArray.length; j++) {
            symbol = inputStringAsCharArray[j];
            numberOfSymbol = countMap.get(symbol);
            if (numberOfSymbol != null) {
                countMap.put(symbol, numberOfSymbol + 1);
            } else {
                countMap.put(symbol, 1);
            }
        }
        return countMap;
    }

    private void checkContainsInputStringInCache(String input) {
        setInputData(input);
        if (cache.checkKey(getInputString())) {
            printer.printResult(cache.getValueFromCacheMap(getInputString()), getInputString());
        } else {
            cache.putValueToCache(getInputString(), countNumbersOfCharInString(getInputString()));
            printer.printResult(countNumbersOfCharInString(getInputString()), getInputString());
        }
    }

    private String getInputString() {
        return inputString;
    }

    private void setInputData(String inputData) {
        this.inputString = inputData;
    }
}
