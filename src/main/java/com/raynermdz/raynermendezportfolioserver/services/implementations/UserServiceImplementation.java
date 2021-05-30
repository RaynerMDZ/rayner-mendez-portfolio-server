package com.raynermdz.raynermendezportfolioserver.services.implementations;

import com.raynermdz.raynermendezportfolioserver.models.User;
import com.raynermdz.raynermendezportfolioserver.repositories.UserRepository;
import com.raynermdz.raynermendezportfolioserver.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@Service
public class UserServiceImplementation implements UserService {

    private final UserRepository userRepository;

    @Override
    public Optional<User> saveUser(User user) {
        return Optional.empty();
    }

    @Override
    public Optional<List<User>> getAllUsers() {
        return Optional.empty();
    }

    @Override
    public Optional<User> getUserById(UUID userId) {
        return Optional.empty();
    }

    @Override
    public Optional<User> updateUser(User user) {
        return Optional.empty();
    }

    @Override
    public Boolean deleteUser(UUID userId) {
        return null;
    }

    @Override
    public Boolean activateUser(UUID userId) {
        return null;
    }

    @Override
    public Boolean deactivateUser(UUID userId) {
        return null;
    }
}
