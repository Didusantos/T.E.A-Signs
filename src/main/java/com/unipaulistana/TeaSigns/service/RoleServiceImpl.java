package com.unipaulistana.TeaSigns.service;

import com.unipaulistana.TeaSigns.domainmodel.Role;
import com.unipaulistana.TeaSigns.domainmodel.repositories.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService{

    private final RoleRepository roleRepository;

    @Override
    public List<Role> findAll() {
        return this.roleRepository.findAll();
    }

    @Override
    public Optional<Role> findRoleById(UUID id) {
        return this.roleRepository.findRoleById(id);
    }

    @Override
    public Role findRoleByName(String name) {
        return this.roleRepository.findRoleByName(name);
    }

    @Override
    public Role createRole(Role role) {
        return this.roleRepository.save(role);
    }

    @Override
    public Role updateRole(Role role) {
        return this.roleRepository.save(role);
    }

    @Override
    public void deleteRoleById(UUID id) {
        this.roleRepository.deleteById(id);
    }

}
