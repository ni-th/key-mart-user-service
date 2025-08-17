package com.keymart.identity.service;

import com.keymart.identity.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO add(UserDTO userDto);
    UserDTO update(UserDTO userDto);
    Boolean deleteById(Long id);
    UserDTO findById(Long id);
    List<UserDTO> findAll();
    UserDTO findByEmail(String email);

}
