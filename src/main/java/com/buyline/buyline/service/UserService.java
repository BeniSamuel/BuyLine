package com.buyline.buyline.service;

import java.util.ArrayList;
import java.util.List;
import com.buyline.buyline.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private List<User> users = new ArrayList<>();
    public List<User> getAllUsers () {
        return users;
    }

    public User getUserByEmail ( String email ) {
        for (User user: users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    public User addUser ( String name, String email, String password, int phone ) {
        return new User(name, email, password, phone);
    }
}
