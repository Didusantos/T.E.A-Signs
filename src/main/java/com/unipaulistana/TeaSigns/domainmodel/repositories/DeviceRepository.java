package com.unipaulistana.TeaSigns.domainmodel.repositories;

import com.unipaulistana.TeaSigns.domainmodel.Device;
import com.unipaulistana.TeaSigns.domainmodel.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface DeviceRepository extends JpaRepository<Device, UUID> {

    public Optional<Device> findById(UUID id);

    public List<Device> findByName(String name);

    public List<Device> findAll();

    public List<Device> findByUser(User user);

    public List<Device> findByCategory(String category);


    List<Device> findDeviceById(UUID id);
}
