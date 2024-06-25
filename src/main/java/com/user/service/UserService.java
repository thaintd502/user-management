package com.user.service;

import com.user.dto.UserDTO;
import com.user.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(UserDTO userDTO);
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
    User updateUser(Long id, UserDTO userDTO);
    void deleteUser(Long id);
    // Các phương thức khác nếu cần
}
