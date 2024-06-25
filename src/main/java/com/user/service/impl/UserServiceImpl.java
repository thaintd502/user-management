package com.user.service.impl;

import com.user.dto.UserDTO;
import com.user.entity.User;
import com.user.repository.UserRepository;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(UserDTO userDTO) {
        User user = new User();
        user.setCreatedBy(userDTO.getCreatedBy());
        user.setCreatedDate(LocalDateTime.now());
        user.setEmail(userDTO.getEmail());
        user.setGoogleUserId(userDTO.getGoogleUserId());
        user.setLoginType(userDTO.getLoginType());
        user.setMobile(userDTO.getMobile());
        user.setName(userDTO.getName());
        user.setPassword(userDTO.getPassword());
        user.setPhotoUrl(userDTO.getPhotoUrl());
        user.setStatus(userDTO.getStatus());
        user.setSysUserType(userDTO.getSysUserType());
        user.setUserType(userDTO.getUserType());
        user.setUsername(userDTO.getUsername());
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User updateUser(Long id, UserDTO userDTO) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setModifiedBy(userDTO.getCreatedBy()); // Assuming the user updating is the creator
            user.setModifiedDate(LocalDateTime.now());
            user.setEmail(userDTO.getEmail());
            user.setGoogleUserId(userDTO.getGoogleUserId());
            user.setLoginType(userDTO.getLoginType());
            user.setMobile(userDTO.getMobile());
            user.setName(userDTO.getName());
            user.setPassword(userDTO.getPassword());
            user.setPhotoUrl(userDTO.getPhotoUrl());
            user.setStatus(userDTO.getStatus());
            user.setSysUserType(userDTO.getSysUserType());
            user.setUserType(userDTO.getUserType());
            user.setUsername(userDTO.getUsername());
            return userRepository.save(user);
        } else {
            throw new RuntimeException("User not found");
        }
    }

    @Override
    public void deleteUser(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            userRepository.deleteById(id);
        } else {
            throw new RuntimeException("User not found");
        }
    }

    // Các phương thức khác nếu cần
}
