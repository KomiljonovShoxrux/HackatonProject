package org.example.hackaton.repository;

import org.example.hackaton.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CarRepo extends JpaRepository<Car, UUID> {
    boolean existsByName(String name);
}