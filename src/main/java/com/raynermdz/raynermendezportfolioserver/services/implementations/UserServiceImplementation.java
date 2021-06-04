package com.raynermdz.raynermendezportfolioserver.services.implementations;

import com.raynermdz.raynermendezportfolioserver.dtos.converter.DtoConverter;
import com.raynermdz.raynermendezportfolioserver.dtos.v1.requestdto.UserRequestDto;
import com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto.UserResponseDto;
import com.raynermdz.raynermendezportfolioserver.exception.EntityNotFoundException;
import com.raynermdz.raynermendezportfolioserver.models.Post;
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
    private final DtoConverter dtoConverter;

    @Override
    public Optional<UserResponseDto> saveUser(UserRequestDto user) {
        return null;
    }

    @Override
    public Optional<List<UserResponseDto>> getAllUsers() {
        return null;
    }

    @Override
    public Optional<UserResponseDto> getUserById(UUID userId) {
        return Optional.of((UserResponseDto) this.dtoConverter.convertToDto(this.userRepository.findById(userId).get(), new UserResponseDto()));
    }

    @Override
    public Optional<UserResponseDto> updateUser(UserRequestDto userRequestDto) {
        User user = (User) this.dtoConverter.convertToEntity(userRequestDto, new User());

        if (this.userRepository.findById(user.getId()).isPresent()) {
            return Optional.of((UserResponseDto) this.dtoConverter.convertToDto(this.userRepository.save(user), new UserResponseDto()));
        }
        return Optional.empty();
    }

    @Override
    public Boolean deleteUser(UUID userId) {
        Optional<User> user = this.userRepository.findById(userId);
        if (user.isPresent()) {
            this.userRepository.delete(user.get());
            return true;
        }
        throw new EntityNotFoundException(User.class, "id", user.toString());
    }

    @Override
    public Boolean activateUser(UUID userId) {
        Optional<User> user = this.userRepository.findById(userId);
        if (user.isPresent()) {
            user.get().setIsActive(true);
            return true;
        }
        throw new EntityNotFoundException(User.class, "id", user.toString());
    }

    @Override
    public Boolean deactivateUser(UUID userId) {
        Optional<User> user = this.userRepository.findById(userId);
        if (user.isPresent()) {
            user.get().setIsActive(false);
            return true;
        }
        throw new EntityNotFoundException(User.class, "id", user.toString());
    }
}
