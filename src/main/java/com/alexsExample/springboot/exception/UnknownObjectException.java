package com.alexsExample.springboot.exception;

import java.io.IOException;

public class UnknownObjectException extends IOException {

    private String message;

    private String resourceName;
}
