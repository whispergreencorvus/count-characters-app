package com.hartmanmark.charcount;

import java.util.LinkedHashMap;


public class CharCounter {

    public LinkedHashMap<String, Integer> countChar(String input) {
        return count(input);
    }

    private LinkedHashMap<String, Integer> count(String enteredString) {
        String[] arrayOfSplittingString = enteredString.split("");
        LinkedHashMap<String, Integer> mapStr = new LinkedHashMap<>();
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
