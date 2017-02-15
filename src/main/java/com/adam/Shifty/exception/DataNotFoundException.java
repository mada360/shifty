package com.adam.Shifty.exception;

/**
 * Created by adam on 15/02/17.
 */
public class DataNotFoundException extends RuntimeException {

    public DataNotFoundException(String message){
        super(message);
    }

}
