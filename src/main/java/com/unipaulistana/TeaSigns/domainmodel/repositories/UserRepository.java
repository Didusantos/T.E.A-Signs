package com.unipaulistana.TeaSigns.domainmodel.repositories;

import com.unipaulistana.TeaSigns.domainmodel.Role;
import com.unipaulistana.TeaSigns.domainmodel.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    public User findUserByName(String name);

    public User findUserById(UUID id);

    public List<User> findAll();

    public User findUserByEmail(String email);

}
