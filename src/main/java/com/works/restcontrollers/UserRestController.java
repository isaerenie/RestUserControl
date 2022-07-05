package com.works.restcontrollers;

import com.works.entities.User;
import com.works.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
 @RequestMapping("/user")
public class UserRestController {
    final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody User user) {
        return userService.save(user);
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody User user) {
        return userService.login(user);
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody User user) {
        return userService.register(user);
    }

    @GetMapping("/search")
    public ResponseEntity search(@RequestParam String q) {
        return userService.search(q);
    }
}
