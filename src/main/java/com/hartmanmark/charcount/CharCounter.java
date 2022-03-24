package com.hartmanmark.charcount;

public class CharCounter {

    Cache cache;
    String enteredString;

    public String getEnteredString() {
        return enteredString;
    }

    public void setEnteredString(String enteredString) {
        this.enteredString = enteredString;
    }

    public CharCounter(Cache cache) {
        this.cache = cache;
    }

    Printer print = new Printer();

    public void countCharResult(String input) {
        count(input);
    }

    private void count(String enteredString) {
        setEnteredString(enteredString);
        String[] arrayOfSplittingString = enteredString.split("");
        for (int i = 0; i < arrayOfSplittingString.length; i++) {
            if (!cache.charCounterResult.containsKey(arrayOfSplittingString[i])) {
                cache.charCounterResult.put(arrayOfSplittingString[i], 1);
            } else {
                cache.charCounterResult.put(arrayOfSplittingString[i],
                        cache.charCounterResult.get(arrayOfSplittingString[i]) + 1);
            }
        }

        cache.addValueToCacheMap(getEnteredString());     
        System.out.println(getEnteredString());
        print.print(cache.cacheMap);
    }

}
