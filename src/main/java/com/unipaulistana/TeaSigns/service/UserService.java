package com.unipaulistana.TeaSigns.service;

import com.unipaulistana.TeaSigns.domainmodel.Role;
import com.unipaulistana.TeaSigns.domainmodel.User;
import com.unipaulistana.TeaSigns.domainmodel.repositories.RoleRepository;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService extends UserDetailsService {

    List<User> findAll();

    Optional<User> findById(UUID id);

    void deleteById(UUID id);

    User create(User user);

    User update(User user);

    User partialUpdate(User user);
}
