package com.unipaulistana.TeaSigns.controller;

import com.unipaulistana.TeaSigns.domainmodel.Role;
import com.unipaulistana.TeaSigns.service.RoleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/roles")
@Tag(name = "Roles", description = "Operações CRUD de roles de usuário")
@RequiredArgsConstructor
public class RoleController {

    private final RoleService roleService;

    @GetMapping
    @Operation(method = "GET", description = "Listar todas as roles de usuário")
    public ResponseEntity<List<Role>> findAll() {
        return ResponseEntity.ok(this.roleService.findAll());
    }

    @GetMapping("/searchrolename")
    public ResponseEntity<Role> findByName(@RequestParam String name) {
        return ResponseEntity.ok(this.roleService.findRoleByName(name));
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteById(@PathVariable UUID id) {
        this.roleService.deleteRoleById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Role> updateRole(@RequestBody Role role) {
        return ResponseEntity.ok(this.roleService.updateRole(role));
    }

    @PatchMapping
    public ResponseEntity<Role> updateRole(@RequestBody UUID id, Role role) {
        return ResponseEntity.ok(this.roleService.createRole(role));
    }

    @PostMapping
    public ResponseEntity<Role> addRole(@RequestBody Role role) {
        return ResponseEntity.ok(this.roleService.createRole(role));
    }
}
