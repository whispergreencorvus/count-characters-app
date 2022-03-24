package com.hartmanmark.charcount;

import java.util.Map;
import java.util.Map.Entry;

public class Printer {

    public void print(Map<String, Map<String, Integer>> cacheMap) {

        for (Entry<String, Map<String, Integer>> map : cacheMap.entrySet()) {
            System.out.print('"' + map.getKey() + '"' + " - " + map.getValue() + "\n");
        }
    }
    

}
