package com.unipaulistana.TeaSigns.domainmodel.repositories;

import com.unipaulistana.TeaSigns.domainmodel.Alert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface AlertRepository extends JpaRepository<Alert, UUID> {

    public Optional<Alert> findById(UUID id);

    public Optional<Alert> findByTitle(String title);

    public List<Alert> findByType(String type);

    public List<Alert> findByStatus(String status);

    public List<Alert> findByStatusAndType(String status, String type);

    public List<Alert> findByCreatedAtBefore(LocalDate createdAtBefore);

    public List<Alert> findByCreatedAtAfter(LocalDate createdAtAfter);
}
