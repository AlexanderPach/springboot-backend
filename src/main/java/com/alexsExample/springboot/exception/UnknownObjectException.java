package com.alexsExample.springboot.exception;

import java.io.IOException;

public class UnknownObjectException extends IOException {


    private Object resourceName;
    private String fieldName;

    public UnknownObjectException(Object resourceName, String fieldName){
        super(String.format("%s could not be parsed through %s", resourceName, fieldName));
        this.resourceName = resourceName;
        this.fieldName = fieldName;

    }


}
