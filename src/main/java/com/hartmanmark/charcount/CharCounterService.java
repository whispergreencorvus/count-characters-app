package com.hartmanmark.charcount;

import java.util.HashMap;
import java.util.Map;

import com.hartmanmark.charcount.exception.InputDataIsEmptyException;

public class CharCounterService {

    private Printer printer = new Printer();
    private CharCounterValidator charCounterValidator = new CharCounterValidator();
    private Cache cache;
    private String inputString;

    public String charCount(String inputString) throws InputDataIsEmptyException {
        charCounterValidator.verify(inputString);
        return checkContainsInputStringInCache(inputString);
    }

    public CharCounterService(Cache cache) {
        this.cache = cache;
    }

    private Map<Character, Integer> countNumbersOfCharInString(String inputString) {
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

    private String checkContainsInputStringInCache(String input) {
        setInputData(input);
        if (Boolean.TRUE.equals(cache.checkKey(getInputString()))) {
            return getValueFromCacheIfKeyIsExist();
        } else {
            cache.putValueToCache(getInputString(), countNumbersOfCharInString(getInputString()));
            return printValue();
        }
    }

    private String getValueFromCacheIfKeyIsExist() {
        return printer.printResult(cache.getValueFromCacheMap(getInputString()), getInputString());
    }

    private String printValue() {
        return printer.printResult(countNumbersOfCharInString(getInputString()), getInputString());
    }

    private String getInputString() {
        return inputString;
    }

    private void setInputData(String inputData) {
        this.inputString = inputData;
    }
}
