package com.unipaulistana.TeaSigns.service;

import com.unipaulistana.TeaSigns.domainmodel.Alert;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AlertService {

    Alert createAlert(Alert alert);

    Alert updateAlert(Alert alert);

    void deleteAlertById(UUID id);

    Optional<Alert> findAlertById(UUID id);

    Optional<Alert> findAlertByTitle(String title);

    List<Alert> findAlertByTimeBefore(LocalDate timeBefore);

    List<Alert> findAlertByTimeAfter(LocalDate timeAfter);

    List<Alert> findAlertByStatus(String status);

    List<Alert> findAlertByType(String type);

}
