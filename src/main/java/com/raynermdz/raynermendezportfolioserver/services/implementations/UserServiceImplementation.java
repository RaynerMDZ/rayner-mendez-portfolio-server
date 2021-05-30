package com.raynermdz.raynermendezportfolioserver.services.implementations;

import com.raynermdz.raynermendezportfolioserver.models.User;
import com.raynermdz.raynermendezportfolioserver.repositories.UserRepository;
import com.raynermdz.raynermendezportfolioserver.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserServiceImplementation implements UserService {

    private final UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public Optional<User> getUserById(UUID postId) {
        return this.userRepository.findById(postId);
    }
}
