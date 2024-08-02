package com.comjava.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "uncategorized exception"),
    USER_EXITED(1002, "User existed"),

    USER_INVALID(1003, "Username must be at least 3 character" ),
    USER_PASSWORD(1004, "password must be at least 8 character"),
    USER_NOT_EXITED(1005, "User not existed"),
    UNAUTHENTICATED(1006, "User Info Not Exactly");
    private int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
