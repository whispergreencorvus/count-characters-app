package com.hartmanmark.charcount;

public class Validator {

    public void verify(String inputString) {

        if (inputString == null) {
            throw new NumberFormatException("null");
        }
    }
}
