package com.keymart.identity.service.impl;

import com.keymart.identity.dto.UserDTO;
import com.keymart.identity.model.User;
import com.keymart.identity.repository.UserRepository;
import com.keymart.identity.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    final UserRepository userRepository;
    public ModelMapper mapper = new ModelMapper();
    @Override
    public UserDTO add(UserDTO userDto) {
        return mapper.map(userRepository.save(mapper.map(userDto,User.class)), UserDTO.class);
    }

    @Override
    public UserDTO update(UserDTO userDto) {
        return mapper.map(userRepository.save(mapper.map(userDto,User.class)), UserDTO.class);
    }

    @Override
    public Boolean deleteById(Long id) {
        if (userRepository.existsById(id)){
            userRepository.deleteById(id);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public UserDTO findById(Long id) {
        return mapper.map(userRepository.findById(id).orElse(null), UserDTO.class);
    }

    @Override
    public List<UserDTO> findAll() {
        List<UserDTO> userDTOList = new ArrayList<>();
        for (User user : userRepository.findAll()) {
            userDTOList.add(mapper.map(user, UserDTO.class));
        }
        return userDTOList;
    }

    @Override
    public UserDTO findByEmail(String email) {
        return mapper.map(userRepository.findByPrimaryEmail(email), UserDTO.class);
    }
}
