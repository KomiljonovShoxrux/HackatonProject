package org.example.hackaton.repository;

import org.example.hackaton.model.carService.RepairEngine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RepairEngineRepo extends JpaRepository<RepairEngine, UUID> {

    boolean existsByStorename(String storename);
}
