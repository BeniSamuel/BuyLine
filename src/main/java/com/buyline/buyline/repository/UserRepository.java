package com.buyline.buyline.repository;

import com.buyline.buyline.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository {
    public User findUserByEmail(String email);
}
