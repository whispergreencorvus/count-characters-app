package com.hartmanmark.charcount;

import java.util.HashMap;
import java.util.Map;

public class CharCounter {

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
}
