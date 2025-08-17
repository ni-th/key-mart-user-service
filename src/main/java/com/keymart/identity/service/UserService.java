package com.keymart.identity.service;

import com.keymart.identity.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    User add(User user);
    User update(User user);
    Boolean deleteById(Long id);
    User findById(Long id);
    List<User> findAll();
    User findByEmail(String email);

}
