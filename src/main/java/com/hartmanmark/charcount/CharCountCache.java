package com.hartmanmark.charcount;

import java.util.LinkedHashMap;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class CharCountCache {

    LoadingCache<String, LinkedHashMap<String, Integer>> cache = CacheBuilder.newBuilder()
            .build(new CacheLoader<String, LinkedHashMap<String, Integer>>() {
                public LinkedHashMap<String, Integer> load(String string) {
                    CharCounter charCount = new CharCounter();
                    return charCount.countChar(string);
                }
            });
}
