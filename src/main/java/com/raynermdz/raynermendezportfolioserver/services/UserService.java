package com.raynermdz.raynermendezportfolioserver.services;

import com.raynermdz.raynermendezportfolioserver.models.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    Optional<User> getUserById(UUID userId);
    Optional<User> updateUser(User user);
    Boolean deleteUser(UUID userId);
    Boolean activateUser(UUID userId);
    Boolean deactivateUser(UUID userId);
}
