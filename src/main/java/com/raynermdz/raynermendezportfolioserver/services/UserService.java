package com.raynermdz.raynermendezportfolioserver.services;

import com.raynermdz.raynermendezportfolioserver.models.User;

import java.util.List;

import java.util.UUID;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    User getUserById(UUID userId);
    User updateUser(User user);
    Boolean deleteUser(UUID userId);
    Boolean activateUser(UUID userId);
    Boolean deactivateUser(UUID userId);
}
