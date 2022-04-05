package com.hartmanmark.charcount;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cache {

    Map<String, Map<Character, Integer>> cacheMap = new LinkedHashMap<>();

    public void putValueToCache(String key, Map<Character, Integer> value) {
        cacheMap.put(key, value);
    }

    public Map<Character, Integer> getValueFromCacheMap(String key) {
        return cacheMap.get(key);
    }

    public boolean checkKey(String key) {
        return cacheMap.containsKey(key);
    }
}
