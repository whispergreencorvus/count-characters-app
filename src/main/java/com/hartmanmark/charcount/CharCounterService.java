package com.hartmanmark.charcount;

import com.hartmanmark.charcount.exception.InputDataIsEmptyException;

public class CharCounterService {

    private Cache cache = new Cache();
    private Printer printer = new Printer();
    private CharCounterValidator charCounterValidator = new CharCounterValidator();
    private CharCounter charCounter;
    private String inputString;

    public String charCount(String inputString) throws InputDataIsEmptyException {
        charCounterValidator.verify(inputString);
        return checkContainsInputStringInCache(inputString);
    }

    public CharCounterService(CharCounter charCounter) {
        this.charCounter = charCounter;
    }

    private String checkContainsInputStringInCache(String input) {
        setInputData(input);
        if (Boolean.TRUE.equals(cache.checkKey(getInputString()))) {
            return getValueFromCache();
        } else {
            putValueToCache();
            return getValueFromCache();
        }
    }

    private String getValueFromCache() {
        return printer.printResult(cache.getValueFromCacheMap(getInputString()), getInputString());
    }

    private void putValueToCache() {
        cache.putValueToCache(getInputString(), charCounter.countNumbersOfCharInString(getInputString()));
    }

    private String getInputString() {
        return inputString;
    }

    private void setInputData(String inputData) {
        this.inputString = inputData;
    }
}
