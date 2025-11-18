package com.unipaulistana.TeaSigns.controller;

import com.unipaulistana.TeaSigns.domainmodel.Device;
import com.unipaulistana.TeaSigns.domainmodel.User;
import com.unipaulistana.TeaSigns.service.DeviceService;
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
@RequestMapping("/api/devices")
@Tag(name = "Devices", description = "Operações CRUD de devices")
@RequiredArgsConstructor
public class DeviceController {

    private final DeviceService deviceService;

    @GetMapping
    @Operation(method = "GET", description = "Listar todos os dispositivos")
    public ResponseEntity<List<Device>> findAll() {
        return ResponseEntity.ok(this.deviceService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Device>> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(this.deviceService.findByDeviceId(id));
    }

    @GetMapping("/search")
    @Operation(method = "GET", description = "Listar todos os dispositivos por nome")
    public ResponseEntity<List<Device>> findByName(@RequestParam String name) {
        return ResponseEntity.ok(this.deviceService.findByDeviceName(name));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDeviceById(@PathVariable UUID id) {
        this.deviceService.deleteDeviceById(id);
        return ResponseEntity.notFound().build();
    }

    @PostMapping()
    public ResponseEntity<Device> createDevice(@RequestBody Device device) {
        return new ResponseEntity<>(this.deviceService.createDevice(device), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Device> update(@RequestBody Device device) {
        return new ResponseEntity<>(this.deviceService.updateDevice(device), HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Device> patchUser(@RequestBody Device device) {
        return new ResponseEntity<>(this.deviceService.partialUpdateDevice(device), HttpStatus.CREATED);
    }
}
