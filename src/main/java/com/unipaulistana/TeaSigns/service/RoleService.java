package com.unipaulistana.TeaSigns.service;

import com.unipaulistana.TeaSigns.domainmodel.Role;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RoleService {

    public List<Role> findAll();

    public Optional<Role> findRoleById(UUID id);

    public Role findRoleByName(String name);

    public Role  createRole(Role role);

    public Role  updateRole(Role role);

    public void deleteRoleById(UUID id);

    public Role partialUpdateRole(Role role);

}
