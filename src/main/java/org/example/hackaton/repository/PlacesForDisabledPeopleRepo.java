package org.example.hackaton.repository;

import org.example.hackaton.model.map.PlacesForDisabledPeople;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PlacesForDisabledPeopleRepo extends JpaRepository<PlacesForDisabledPeople, UUID> {

}
