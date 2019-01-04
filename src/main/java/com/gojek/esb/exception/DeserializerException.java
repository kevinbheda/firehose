package com.gojek.esb.exception;

public class DeserializerException extends Exception {

    public DeserializerException(String message) {
        super(message);
    }

    public DeserializerException(String message, Exception e) {
        super(message, e);
    }
}