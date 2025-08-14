package com.keymart.identity.controller;

import com.keymart.identity.dto.UserDTO;
import com.keymart.identity.model.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserDTO userDTO) {
        return ResponseEntity.ok(userDTO);
    }
    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody UserDTO userDTO) {
        return ResponseEntity.ok(userDTO);
    }
    @PutMapping("/profile/{id}")
    public ResponseEntity<?> updateUserProfile(@PathVariable Long id, @RequestBody UserDTO userDTO){
        return ResponseEntity.ok(userDTO);
    }
    @DeleteMapping("profile/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        return ResponseEntity.ok(id);
    }
    @GetMapping("/profile/{id}")
    public ResponseEntity<?> getUserProfile(@PathVariable Long id) {
        return ResponseEntity.ok(id);
    }
    @DeleteMapping("profile/{email}")
    public ResponseEntity<?> deleteUserByEmail(@PathVariable String UserEmail) {
        return ResponseEntity.ok(UserEmail);
    }
    @GetMapping("/verify-email")
    public ResponseEntity<?> verifyEmail(@RequestParam String token) {
        return ResponseEntity.ok(token);
    }
}
