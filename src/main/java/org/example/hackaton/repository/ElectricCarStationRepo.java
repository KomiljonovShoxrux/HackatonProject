package org.example.hackaton.repository;

import org.example.hackaton.model.station.ElectricCarStation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ElectricCarStationRepo extends JpaRepository<ElectricCarStation, UUID> {

    boolean existsByName(String name);
}
