package com.hartmanmark.charcount.exception;

@SuppressWarnings("serial")
public class InputDataIsNullException extends Exception{

    public InputDataIsNullException(String message) {
        super(message);
    }
}