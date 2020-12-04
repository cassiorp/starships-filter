package com.forttiori.starshipsfilter.Exceptions;

public class StarshipNotFoundException extends RuntimeException {
    public StarshipNotFoundException(String message) {
        super(message);
    }
}
