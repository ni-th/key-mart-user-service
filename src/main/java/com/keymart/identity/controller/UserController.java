package com.keymart.identity.controller;
import com.keymart.identity.dto.UserDTO;
import com.keymart.identity.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {
    final UserService userService;
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserDTO userDTO) {
//        userService.add(userDTO);
        System.out.println(userDTO);
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
