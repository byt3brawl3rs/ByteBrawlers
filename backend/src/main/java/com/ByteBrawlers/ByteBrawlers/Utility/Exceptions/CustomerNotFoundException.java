package com.ByteBrawlers.ByteBrawlers.Utility.Exceptions;

import java.io.Serial;

public class CustomerNotFoundException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public CustomerNotFoundException() {
        super("Could not find Customer ID");
    }

    public CustomerNotFoundException(int CustomerId) {
        super("Could not find Customer ID " + CustomerId);
    }
}