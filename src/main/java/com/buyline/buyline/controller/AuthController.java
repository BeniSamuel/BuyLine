package com.buyline.buyline.controller;

import com.buyline.buyline.dto.UserInformDto;
import com.buyline.buyline.dto.UserLoginDto;
import com.buyline.buyline.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.buyline.buyline.model.User;

@RestController
@RequestMapping(path= "api/v1/auth")
public class AuthController {
    private final AuthService authService;

    public AuthController (AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/signup")
    public ResponseEntity<User> registerUser (@RequestBody UserInformDto userInform) {
        User newUser = this.authService.createUser(userInform.getUsername(), userInform.getEmail(), userInform.getPassword(), userInform.getPhone());
        return ResponseEntity.ok(newUser);
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser (@RequestBody UserLoginDto userLogin ) {
        String response = this.authService.loginUser(userLogin.getEmail(), userLogin.getPassword());
        return ResponseEntity.ok(response);
    }
}
