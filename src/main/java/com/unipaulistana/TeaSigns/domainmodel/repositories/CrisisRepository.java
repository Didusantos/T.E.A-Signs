package com.unipaulistana.TeaSigns.domainmodel.repositories;

import com.unipaulistana.TeaSigns.domainmodel.Crisis;
import com.unipaulistana.TeaSigns.domainmodel.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface CrisisRepository extends JpaRepository<Crisis, UUID>, CrisisRepositoryCustom<Crisis, UUID> {

    public Optional<Crisis> findById(UUID id);

    public List<Crisis> findAll();

    public List<Crisis> findByUser(User user);


}
