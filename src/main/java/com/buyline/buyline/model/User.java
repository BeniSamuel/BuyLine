package com.buyline.buyline.model;


import jakarta.persistence.*;

@Entity
@Table(name= "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column
    private String username;

    @Column(unique = true)
    private String email;

    @Column
    private String password;

    @Column(unique = true)
    private int phone;



    public String getUsername () { return this.username; }
    public String getEmail () { return this.email; }
    public String getPassword () { return this.password; }
    public int getPhoneNumber () { return this.phone; }

    // Setters
    public void setUsername ( String name ) { this.username = name; }
    public void setEmail ( String name ) { this.email = email; }
    public void setPassword ( String password ) { this.password = password; }
    public void setPhone ( int phone ) { this.phone = phone; }

    public void setUserId(int id) {
        this.userId = id;
    }

    public int getId() {
        return userId;
    }
}
