package com.hartmanmark.charcount;

import java.util.Map;
import java.util.Map.Entry;

public class Printer {

    public String printResult(Map<Character, Integer> countMap, String inputString) {
        StringBuilder result = new StringBuilder();
        result.append(inputString + "\n");
        for (Entry<Character, Integer> map : countMap.entrySet()) {
            result.append('"' + map.getKey().toString() + '"' + " - " + map.getValue() + "\n");
        }
        return result.toString();
    }
}
