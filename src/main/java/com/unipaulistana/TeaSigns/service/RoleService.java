package com.unipaulistana.TeaSigns.service;

import com.unipaulistana.TeaSigns.domainmodel.Role;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RoleService {

    List<Role> findAll();

    Optional<Role> findRoleById(UUID id);

    Role findRoleByName(String name);

    Role  createRole(Role role);

    Role  updateRole(Role role);

    void deleteRoleById(UUID id);


}
