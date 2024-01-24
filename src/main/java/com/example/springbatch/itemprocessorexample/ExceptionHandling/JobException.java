package com.example.springbatch.itemprocessorexample.ExceptionHandling;

import lombok.experimental.StandardException;

import java.io.Serial;

@StandardException
public class JobException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = -714897194188390649L;

    public JobException(String message, Exception exception){
        super(message, exception);
    }
}
