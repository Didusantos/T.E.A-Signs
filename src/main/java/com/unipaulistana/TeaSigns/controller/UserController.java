package com.unipaulistana.TeaSigns.controller;

import com.unipaulistana.TeaSigns.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.unipaulistana.TeaSigns.domainmodel.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/user")
@Tag(name = "Usuários", description = "Operações CRUD de usuários")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    @GetMapping
    @Operation(method = "GET", description = "Listar todos os usuários")
    public ResponseEntity<List<User>> findAll() {

        return ResponseEntity.ok(this.userService.findAll());
    }

    // http://localhost:8080/users/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(this.userService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable UUID id) {
        this.userService.deleteById(id);
        return ResponseEntity.notFound().build();
    }

    @PostMapping()
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return new ResponseEntity<>(this.userService.create(user), HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity<User> update(@RequestBody User user) {
        return new ResponseEntity<>(this.userService.create(user), HttpStatus.CREATED);
    }

    @PatchMapping()
    public ResponseEntity<User> patchUser(@RequestBody User user) {
        return new ResponseEntity<>(this.userService.partialUpdate(user), HttpStatus.CREATED);
    }


}
