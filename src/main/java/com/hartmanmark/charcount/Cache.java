package com.hartmanmark.charcount;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Cache {

    String inputString;
    Map<String, Map<Character, Integer>> cacheMap = new LinkedHashMap<>();
    Map<Character, Integer> countMap = new HashMap<>();

    public Map<Character, Integer> countNumbersOfCharInString(String input) {
        setInputData(input);
        countMap.clear();
        char symbol;
        Integer numberOfSymbol;
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
        checkContainsInputStringInCache(); 
        return countMap;
    }

    public void putValueToCache(String key, Map<Character, Integer> value) {
        cacheMap.put(key, value);
    }

    public Map<Character, Integer> getValueFromCacheMap(String key) {
        return cacheMap.get(key);
    }

    public boolean checkKey(String key) {
        return cacheMap.containsKey(key);
    }

    public void checkContainsInputStringInCache() {
        if (checkKey(getInputString())) {
            printResult(getValueFromCacheMap(getInputString()));
        } else {
            putValueToCache(getInputString(), countMap);
            printResult(countMap);
        }
    }

    public void printResult(Map<Character, Integer> countMap) {
        System.out.println(getInputString());
        for (Entry<Character, Integer> map : countMap.entrySet()) {
            System.out.print('"' + map.getKey().toString() + '"' + " - " + map.getValue() + "\n");
        }
    }
    
    public Map<Character, Integer> getCountMap() {
        return countMap;
    }

    public void setCountMap(Map<Character, Integer> countMap) {
        this.countMap = countMap;
    }

    public String getInputString() {
        return inputString;
    }

    public void setInputData(String inputData) {
        this.inputString = inputData;
    }
}
