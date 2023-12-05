package com.ByteBrawlers.ByteBrawlers.Utility;

public class LoginMessage {
    private String message;
    private boolean isValid;

    public LoginMessage(String message, boolean isValid) {
        this.message = message;
        this.isValid = isValid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean getValid() {
        return isValid;
    }

    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }
}
