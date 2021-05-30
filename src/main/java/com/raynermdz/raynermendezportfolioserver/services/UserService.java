package com.raynermdz.raynermendezportfolioserver.services;

import com.raynermdz.raynermendezportfolioserver.models.User;

import java.util.Optional;
import java.util.UUID;

public interface UserService {

    User saveUser(User user);
    Optional<User> getUserById(UUID postId);
}
