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
    public User saveUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserById(UUID userId) {
        return this.userRepository.findById(userId).get();
    }

    @Override
    public User updateUser(User user) {
        if (this.userRepository.findById(user.getId()).isPresent()) {
            return this.userRepository.save(user);
        }
        return null;
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
