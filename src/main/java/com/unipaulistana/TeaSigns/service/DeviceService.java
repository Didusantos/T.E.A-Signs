package com.unipaulistana.TeaSigns.service;

import com.unipaulistana.TeaSigns.domainmodel.Device;
import com.unipaulistana.TeaSigns.domainmodel.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DeviceService {

    public List<Device> findByName(String name);

    public Optional<Device> findByDeviceId(UUID id);

    public List<Device> findByDeviceName(String name);

    public List<Device> findAll();

    public List<Device> findByDeviceByUser(User user);

    public Device createDevice(Device device);

    public Device updateDevice(Device device);

    public void deleteDeviceById(UUID id);

    public Device partialUpdateDevice(Device device);

}
