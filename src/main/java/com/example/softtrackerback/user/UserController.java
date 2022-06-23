package com.example.softtrackerback.user;

import com.example.softtrackerback.shared.GenericResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1.0")
@CrossOrigin(origins = "http://localhost:3000")
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
        System.out.println("A new user was saved ");
        return new GenericResponse("User saved");
    }
}
