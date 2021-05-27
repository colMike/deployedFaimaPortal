package com.revenue.revenueCollection._exceptions;

public class GenericServiceException extends RuntimeException {

    public static final long serialVersionUID = 1238848923929333929L;

    public GenericServiceException(String message) {
        super(message);
    }
}
