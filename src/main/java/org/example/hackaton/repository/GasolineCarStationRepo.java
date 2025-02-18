package org.example.hackaton.repository;

import org.example.hackaton.model.station.GasolineCarStation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GasolineCarStationRepo extends JpaRepository<GasolineCarStation, UUID> {

    boolean existsByName(String name);

}
