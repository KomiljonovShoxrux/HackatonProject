package org.example.hackaton.model.station;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ElectricCarStation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @Column(nullable = false)
    private String name;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String size;
    @Column(nullable = false)
    private int chargers;
    @Column(nullable = false)
    private String quality;
    @Column(nullable = false)
    private boolean availability;
    @Column(nullable = false)
    private String openingTime;
    @Column(nullable = false)
    private String closingTime;
    @Column(nullable = false)
    private String price;
}
