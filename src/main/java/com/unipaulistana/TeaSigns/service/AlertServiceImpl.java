package com.unipaulistana.TeaSigns.service;

import com.unipaulistana.TeaSigns.domainmodel.Alert;
import com.unipaulistana.TeaSigns.domainmodel.repositories.AlertRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AlertServiceImpl implements AlertService {

    private final AlertRepository alertRepository;

    @Override
    public Alert createAlert(Alert alert) {
        return this.alertRepository.save(alert);
    }

    @Override
    public Alert updateAlert(Alert alert) {
        return this.alertRepository.save(alert);
    }

    @Override
    public void deleteAlertById(UUID id) {
        this.alertRepository.deleteById(id);
    }

    @Override
    public Optional<Alert> findAlertById(UUID id) {
        return alertRepository.findById(id);
    }

    @Override
    public Optional<Alert> findAlertByTitle(String title) {
        return alertRepository.findByTitle(title);
    }

    @Override
    public List<Alert> findAlertByTimeBefore(LocalDate timeBefore) {
        return alertRepository.findByCreatedAtBefore(timeBefore);
    }

    @Override
    public List<Alert> findAlertByTimeAfter(LocalDate timeAfter) {
        return alertRepository.findByCreatedAtAfter(timeAfter);
    }

    @Override
    public List<Alert> findAlertByStatus(String status) {
        return alertRepository.findByStatus(status);
    }

    @Override
    public List<Alert> findAlertByType(String type) {
        return alertRepository.findByType(type);
    }
}
