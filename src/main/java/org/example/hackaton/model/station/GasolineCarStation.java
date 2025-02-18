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
public class GasolineCarStation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @Column(nullable = false)
    private String name;
    private BigDecimal longitude;
    private BigDecimal latitude;
    @Column(nullable = false)
    private String size;
    @Column(nullable = false)
    private int galons;
    @Column(nullable = false)
    private String quality;
    @Column(nullable = false)
    private String eightyFuelAvailability;
    @Column(nullable = false)
    private String ninetyTwoFuelAvailability;
    @Column(nullable = false)
    private String ninetyFiveFuelAvailability;
    @Column(nullable = false)
    private String hundredFuelAvailability;
    @Column(nullable = false)
    private String price;
}
