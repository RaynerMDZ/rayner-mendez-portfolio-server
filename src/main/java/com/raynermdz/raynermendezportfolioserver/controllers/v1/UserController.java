package com.raynermdz.raynermendezportfolioserver.controllers.v1;

import com.raynermdz.raynermendezportfolioserver.models.User;
import com.raynermdz.raynermendezportfolioserver.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/v1/")
@CrossOrigin(value = "${cross.origin.url}")
public class UserController {

    private final UserService userService;

    @GetMapping(value = "{postId}/user")
    public ResponseEntity<User> getPostById(@PathVariable("postId") UUID postId) {

        Optional<User> user = this.userService.getUserById(postId);

        return user.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(new User(), HttpStatus.NOT_FOUND));

    }
}
