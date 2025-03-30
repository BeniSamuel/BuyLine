package com.buyline.buyline.model;

public class User {

    private String username;
    private String email;
    private String password;
    private int phone;

    public User ( String name, String email, String password, int phone ) {
        this.username = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    public String getUsername () { return this.username; }
    public String getEmail () { return this.email; }
    public String getPassword () { return this.password; }
    public int getPhoneNumber () { return this.phone; }

    // Setters
    public void setUsername ( String name ) { this.username = name; }
    public void setEmail ( String name ) { this.email = email; }
    public void setPassword ( String password ) { this.password = password; }
    public void setPhone ( int phone ) { this.phone = phone; }
}
