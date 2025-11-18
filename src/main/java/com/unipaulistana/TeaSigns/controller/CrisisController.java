package com.unipaulistana.TeaSigns.controller;

import com.unipaulistana.TeaSigns.domainmodel.Crisis;
import com.unipaulistana.TeaSigns.service.CrisisService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/crisis")
@RequiredArgsConstructor
@Tag(name = "Crisis", description = "Operações CRUD de crisis")
public class CrisisController {

    private final CrisisService crisisService;

    @GetMapping("crises")
    public ResponseEntity<List<Crisis>> findAll() {
        return ResponseEntity.ok(crisisService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Crisis>> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(crisisService.findById(id));
    }

    @PostMapping("/crises")
    public ResponseEntity<Crisis> create(@RequestBody Crisis crisis) {
        return new ResponseEntity<>(this.crisisService.createCrisis(crisis), HttpStatus.CREATED);
    }

    @PutMapping("/crises")
    public ResponseEntity<Crisis> update(@RequestBody Crisis crisis) {
        return new ResponseEntity<>(this.crisisService.updateCrisis(crisis), HttpStatus.CREATED);
    }

    @PatchMapping("/patch/{id}")
    public ResponseEntity<Crisis> partialUpdate(@RequestBody Crisis crisis) {
        return new  ResponseEntity<>(this.crisisService.updateCrisis(crisis), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        crisisService.deleteByCrisisId(id);
        return ResponseEntity.notFound().build();
    }

}
