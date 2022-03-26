package com.hartmanmark.charcount;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cache {

    Validator validator = new Validator();
    Printer printer = new Printer();
    CharCounter charCounter = new CharCounter();   

    private String inputString;
    private Map<String, Map<Character, Integer>> cacheMap = new LinkedHashMap<>();

    public void cache(String inputString) {
        validator.verify(inputString);
        checkContainsInputStringInCache(inputString);
    }

    private void checkContainsInputStringInCache(String input) {
        setInputData(input);
        if (checkKey(getInputString())) {
            printer.printResult(getValueFromCacheMap(getInputString()), getInputString());
        } else {
            putValueToCache(getInputString(), charCounter.countNumbersOfCharInString(getInputString()));
            printer.printResult(charCounter.countNumbersOfCharInString(getInputString()), getInputString());
        }
    }

    private void putValueToCache(String key, Map<Character, Integer> value) {
        cacheMap.put(key, value);
    }

    private Map<Character, Integer> getValueFromCacheMap(String key) {
        return cacheMap.get(key);
    }

    private boolean checkKey(String key) {
        return cacheMap.containsKey(key);
    }

    private String getInputString() {
        return inputString;
    }

    private void setInputData(String inputData) {
        this.inputString = inputData;
    }
}
