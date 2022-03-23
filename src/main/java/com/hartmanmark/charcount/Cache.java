package com.hartmanmark.charcount;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Cache {

    CharCounter charCounter = new CharCounter();
    private static final int MAX_SIZE_CACHE = 2;
    Map<String, Integer> mapStr = new LinkedHashMap<>();
    Map<String, Integer> stringToPrint = new LinkedHashMap<>();

    @SuppressWarnings("serial")
    Map<String, Map<String, Integer>> cacheCounter = new LinkedHashMap<String, Map<String, Integer>>() {
        @Override
        protected boolean removeEldestEntry(Map.Entry<String, Map<String, Integer>> eldest) {
            return size() > MAX_SIZE_CACHE;
        }
    };
    
    public Map<String, Map<String, Integer>> putCharCounterResultToCache(String str) {
        mapStr = charCounter.countCharResult(str);
        cacheCounter.put(str, mapStr);
        return cacheCounter;
    }

//    public boolean keyIsExist(String str) {
//        return cacheCounter.containsKey(str);
//    }

}
