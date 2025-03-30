package com.buyline.buyline.service;

import com.buyline.buyline.model.User;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class AuthService {
    private List<User> users = new ArrayList<>();
    private final UserService userService;

    public AuthService ( UserService userService ) {
        this.userService = userService;
    }

    public User createUser ( String name, String email, String password, int phone ) {
        return this.userService.addUser(name, email, password, phone);
    }

    public String loginUser ( String email, String password ) {
       User user = this.userService.getUserByEmail(email);
       if (user == null) return "Invalid Credentials";
       return "Success";
    }
}
