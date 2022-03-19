package com.hartmanmark.charcount;

import java.util.Map;
import java.util.concurrent.ExecutionException;

public class Printer {

    public void pring(String enteredStringFromMain) throws ExecutionException {
        CharCountCache cache = new CharCountCache();
        Map<String, Integer> mapStr = cache.cache.get(enteredStringFromMain);
        System.out.println(enteredStringFromMain);
        for (Map.Entry<String, Integer> map : mapStr.entrySet()) {
            System.out.print('"' + map.getKey() + '"' + " - " + map.getValue() + "\n");
        }
    }
}
