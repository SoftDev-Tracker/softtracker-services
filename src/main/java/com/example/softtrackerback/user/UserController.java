package com.example.softtrackerback.user;

import com.example.softtrackerback.shared.GenericResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1.0")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    String allUsers() {
        return "All users";
    }

    @PostMapping("/users")
    GenericResponse createUser(@RequestBody User user) {
        userService.save(user);
        return new GenericResponse("User saved");
    }
}
