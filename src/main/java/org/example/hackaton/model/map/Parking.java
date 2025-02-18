package org.example.hackaton.model.map;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Parking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @Column(unique = true, nullable = false)
    private String parkingname;
    @Column(nullable = false)
    private String size;
    @Column(nullable = false)
    private String placeForDisabledPeople;
    @Column(nullable = false)
    private String freeParking;
    @Column(nullable = false)
    private String pricinessParking;

}
