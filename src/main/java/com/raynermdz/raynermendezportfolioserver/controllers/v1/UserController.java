package com.raynermdz.raynermendezportfolioserver.controllers.v1;

import com.raynermdz.raynermendezportfolioserver.dtos.v1.requestdto.UserRequestDto;
import com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto.UserResponseDto;
import com.raynermdz.raynermendezportfolioserver.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/v1/users/")
@CrossOrigin(value = "${cross.origin.url}")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserResponseDto> saveUser(UserRequestDto user) {
        return null;
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDto>> getUsers() {
        return null;
    }

    @GetMapping(value = "{userId}")
    public ResponseEntity<UserResponseDto> getUserById(@PathVariable("userId") UUID userId) {

      return new ResponseEntity<>(this.userService.getUserById(userId).get(), HttpStatus.OK);

    }

    @PutMapping
    public ResponseEntity<UserResponseDto> updateUser(@RequestBody UserRequestDto user) {
        return null;
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Boolean> deleteUser(@PathVariable(value = "id") UUID userId) {
        return null;
    }

    @PatchMapping(value = "{id}/activate")
    public ResponseEntity<Boolean> activateUser(@PathVariable(value = "id") UUID userId) {
        return null;
    }

    @PatchMapping(value = "{id}/deactivate")
    public ResponseEntity<Boolean> deactivateUser(@PathVariable(value = "id") UUID userId) {
        return null;
    }
}
