package com.unipaulistana.TeaSigns.controller;

import com.unipaulistana.TeaSigns.domainmodel.Alert;
import com.unipaulistana.TeaSigns.service.AlertService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/alerts")
@RequiredArgsConstructor
public class AlertController {

    private final AlertService alertService;


    @PostMapping
    public ResponseEntity<Alert> createAlert(@RequestBody Alert alert) {
        return new ResponseEntity<>(this.alertService.createAlert(alert), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Alert> updateAlert(@RequestBody Alert alert) {
        return ResponseEntity.ok(this.alertService.updateAlert(alert));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAlert(@PathVariable UUID id) {
        this.alertService.deleteAlertById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Alert>> getAlertById(@PathVariable UUID id) {
        return ResponseEntity.ok(this.alertService.findAlertById(id));
    }

    @GetMapping("/search")
    public ResponseEntity<Optional<Alert>> getAlertByTitle(@RequestParam String title) {
        return ResponseEntity.ok(this.alertService.findAlertByTitle(title));
    }

    @GetMapping("/history/before")
    public ResponseEntity<List<Alert>> getAlertsBefore(@RequestParam LocalDate dateBefore) {
        return ResponseEntity.ok(this.alertService.findAlertByTimeBefore(dateBefore));
    }

    @GetMapping("/history/after")
    public ResponseEntity<List<Alert>> getAlertsAfter(@RequestParam LocalDate dateAfter) {
        return ResponseEntity.ok(this.alertService.findAlertByTimeAfter(dateAfter));
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<Alert>> getAlertsByStatus(@PathVariable String status) {
        return ResponseEntity.ok(this.alertService.findAlertByStatus(status));
    }

    @GetMapping("/type/{type}")
    public ResponseEntity<List<Alert>> getAlertsByType(@PathVariable String type) {
        return ResponseEntity.ok(this.alertService.findAlertByType(type));
    }
}
