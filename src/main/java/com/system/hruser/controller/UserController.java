package com.system.hruser.controller;

import com.system.hruser.entities.User;
import com.system.hruser.repository.UserReposotory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserReposotory userReposotory;

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj = userReposotory.findById(id).get();
        return ResponseEntity.ok(obj);
    }

    @GetMapping("/search") ///search?.... @RequestParam
    public ResponseEntity<User> findByEmail(@RequestParam String email){
        User obj = userReposotory.findByEmail(email);
        return ResponseEntity.ok(obj);
    }

}
