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
@RequestMapping(value = "/api/v1/user/")
@CrossOrigin(value = "${cross.origin.url}")
public class UserController {

    private final UserService userService;

    @PostMapping(value = "save")
    public ResponseEntity<User> saveUser(User user) {
        return null;
    }

    @GetMapping(value = "users")
    public ResponseEntity<List<User>> getUserById() {
        return null;
    }

    @GetMapping(value = "{userId}")
    public ResponseEntity<User> getUserById(@PathVariable("userId") UUID userId) {

        Optional<User> user = this.userService.getUserById(userId);

        return user.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(new User(), HttpStatus.NOT_FOUND));

    }

    @PatchMapping(value = "{id}/update")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        return null;
    }

    @PatchMapping(value = "{id}/delete")
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
