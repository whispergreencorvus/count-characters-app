package com.hartmanmark.charcount;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCounter {

    public Map<String, Integer> countCharResult(String input) {
        return count(input);
    }

    private Map<String, Integer> count(String enteredString) {
        String[] arrayOfSplittingString = enteredString.split("");
        Map<String, Integer> mapStr = new LinkedHashMap<>();
        for (int i = 0; i < arrayOfSplittingString.length; i++) {
            if (!mapStr.containsKey(arrayOfSplittingString[i])) {
                mapStr.put(arrayOfSplittingString[i], 1);
            } else {
                mapStr.put(arrayOfSplittingString[i], mapStr.get(arrayOfSplittingString[i]) + 1);
            }
        }
        return mapStr;
    }
}
