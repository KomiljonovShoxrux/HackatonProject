package org.example.hackaton.repository;

import org.example.hackaton.model.carService.TowingServices;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TowingServicesRepo extends JpaRepository<TowingServices , UUID> {

}
