package org.example.hackaton.repository;

import org.example.hackaton.model.map.Parking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ParkingRepo extends JpaRepository<Parking, UUID> {

    boolean existsByParkingname(String parkingname);
}
