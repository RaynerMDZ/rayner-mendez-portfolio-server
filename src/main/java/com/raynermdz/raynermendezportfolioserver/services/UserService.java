package com.raynermdz.raynermendezportfolioserver.services;

import com.raynermdz.raynermendezportfolioserver.dtos.v1.requestdto.UserRequestDto;
import com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto.UserResponseDto;

import java.util.List;

import java.util.Optional;
import java.util.UUID;

public interface UserService {
    Optional<UserResponseDto> saveUser(UserRequestDto user);
    Optional<List<UserResponseDto>> getAllUsers();
    Optional<UserResponseDto> getUserById(UUID userId);
    Optional<UserResponseDto> updateUser(UserRequestDto user);
    Boolean deleteUser(UUID userId);
    Boolean activateUser(UUID userId);
    Boolean deactivateUser(UUID userId);
}
