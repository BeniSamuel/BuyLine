package com.buyline.buyline.utils;

public class ApiResponse <T> {
    private String message;
    private T data;
    private int status;

    public ApiResponse ( String message, T data, int status ) {
        this.message = message;
        this.data = data;
        this.status = status;
    }

    public String getMessage () { return this.message; }
    public T getData () { return this.data; }
    public int getStatus ()  { return this.status; }
}
