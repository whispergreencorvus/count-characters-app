package com.hartmanmark.charcount;

import java.util.Map;
import java.util.Map.Entry;

public class Printer {

    public void printResult(Map<Character, Integer> countMap, String inputString) {
        System.out.println(inputString);
        for (Entry<Character, Integer> map : countMap.entrySet()) {
            System.out.print('"' + map.getKey().toString() + '"' + " - " + map.getValue() + "\n");
        }
    }
}
