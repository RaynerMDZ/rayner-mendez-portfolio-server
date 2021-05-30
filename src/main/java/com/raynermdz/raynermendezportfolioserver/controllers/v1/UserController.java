package com.raynermdz.raynermendezportfolioserver.controllers.v1;

import com.raynermdz.raynermendezportfolioserver.models.User;
import com.raynermdz.raynermendezportfolioserver.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/v1/users/")
@CrossOrigin(value = "${cross.origin.url}")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<User> saveUser(User user) {
        return null;
    }

    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        return null;
    }

    @GetMapping(value = "{userId}")
    public ResponseEntity<User> getUserById(@PathVariable("userId") UUID userId) {

        return new ResponseEntity<>(this.userService.getUserById(userId), HttpStatus.OK);

//        return user.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
//                .orElseGet(() -> new ResponseEntity<>(new User(), HttpStatus.NOT_FOUND));

    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user) {
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
