package org.example.hackaton.model.map;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PlacesForDisabledPeople {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @Column(nullable = false)
    private String region;
    @Column(nullable = false)
    private String size;
    @Column(nullable = false)
    private BigDecimal latitude;
    private BigDecimal longitude;
    private Timestamp incomeTime;
    private Timestamp outcomeTime;
    @Column(nullable = false)
    private String price;
}
