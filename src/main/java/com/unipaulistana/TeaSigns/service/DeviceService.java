package com.unipaulistana.TeaSigns.service;

import com.unipaulistana.TeaSigns.domainmodel.Device;
import com.unipaulistana.TeaSigns.domainmodel.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DeviceService {

    Optional<Device> findByDeviceId(UUID id);

    List<Device> findByDeviceName(String name);

    List<Device> findAll();

    Device createDevice(Device device);

    Device updateDevice(Device device);

    void deleteDeviceById(UUID id);

    Device partialUpdateDevice(Device device);

}
