package org.example.hackaton.repository;

import org.example.hackaton.model.carService.CarWash;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CarWashRepo extends JpaRepository<CarWash, UUID> {
    boolean existsByName(String name);
}
