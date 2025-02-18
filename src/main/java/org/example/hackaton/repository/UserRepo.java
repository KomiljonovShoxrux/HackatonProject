package org.example.hackaton.repository;

import org.example.hackaton.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepo extends JpaRepository<User, UUID> {

    boolean existsByFirstname(String firstname);
}
