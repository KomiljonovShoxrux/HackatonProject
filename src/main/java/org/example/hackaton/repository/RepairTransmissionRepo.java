package org.example.hackaton.repository;

import org.example.hackaton.model.carService.RepairTransmission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RepairTransmissionRepo extends JpaRepository<RepairTransmission, UUID> {
    boolean existsByStorename(String storename);
}
