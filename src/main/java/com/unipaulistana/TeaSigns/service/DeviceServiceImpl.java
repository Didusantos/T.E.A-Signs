package com.unipaulistana.TeaSigns.service;

import com.unipaulistana.TeaSigns.domainmodel.Device;
import com.unipaulistana.TeaSigns.domainmodel.User;
import com.unipaulistana.TeaSigns.domainmodel.repositories.DeviceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DeviceServiceImpl implements DeviceService {

    private final DeviceRepository deviceRepository;

    @Override
    public List<Device> findByName(String name) {
        return deviceRepository.findByName(name);
    }

    @Override
    public Optional<Device> findByDeviceId(UUID id) {
        return deviceRepository.findById(id);
    }

    @Override
    public List<Device> findByDeviceName(String name) {
        return deviceRepository.findByName(name);
    }

    @Override
    public List<Device> findAll() {
        return deviceRepository.findAll();
    }

    @Override
    public List<Device> findByDeviceByUser(User user) {
        return deviceRepository.findByUser(user);
    }

    @Override
    public Device createDevice(Device device) {
        return deviceRepository.save(device);
    }

    @Override
    public Device updateDevice(Device device) {
        return deviceRepository.save(device);
    }

    @Override
    public void deleteDeviceById(UUID id) {
        this.deviceRepository.deleteById(id);
    }

    @Override
    public Device partialUpdateDevice(Device device) {
        return this.deviceRepository.save(device);
    }
}
