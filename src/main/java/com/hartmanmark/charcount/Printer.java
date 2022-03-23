package com.hartmanmark.charcount;

import java.util.Map;
import java.util.Map.Entry;

public class Printer {

    public void pring(String enteredStringFromMain) {

        System.out.println(enteredStringFromMain);

//        CharCounter charCounter = new CharCounter();
//        for (Map.Entry<String, Integer> map : charCounter.countCharResult(enteredStringFromMain).entrySet()) {
//            System.out.print('"' + map.getKey() + '"' + " - " + map.getValue() + "\n");
//        }
        Cache cache = new Cache();        
        for (Entry<String, Map<String, Integer>> map : cache.putCharCounterResultToCache(enteredStringFromMain).entrySet()) {
            System.out.print('"' + map.getKey() + '"' + " - " + map.getValue() + "\n");
        }
    }
}
