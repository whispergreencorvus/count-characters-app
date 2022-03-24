package com.hartmanmark.charcount;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Cache {

    Map<String, Map<String, Integer>> cacheMap = new LinkedHashMap<>();
    Map<String, Integer> charCounterResult = new HashMap<>();

    public  Map<String, Integer> getCacheMap() {
        return charCounterResult;
    }

//    public void addIfAbsentValue(String keyChar, Integer numberOfCharacters) {
//        charCounterResult.putIfAbsent(keyChar, numberOfCharacters);
//    }
    
    public void addValueToCacheMap(String keyChar) {
        cacheMap.putIfAbsent(keyChar, charCounterResult);
    }

//    public String getKeyFromCacheMap(String value) {
//        return cacheMap.get(value).toString();
//    }    

//    public Boolean checkKey(String key) {
//        return cacheMap.containsKey(key);
//    }
}
