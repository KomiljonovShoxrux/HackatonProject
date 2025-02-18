package org.example.hackaton.model;

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
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @Column(nullable = false)
    private String storename;
    private BigDecimal longitude;
    private BigDecimal latitude;
    @Column(nullable = false)
    private String doors;
    @Column(nullable = false)
    private String wheels;
    @Column(nullable = false)
    private String tires;
    @Column(nullable = false)
    private String seats;
    @Column(nullable = false)
    private String steeringWheel;
    @Column(nullable = false)
    private String headlights;
    @Column(nullable = false)
    private String bumper;
    @Column(nullable = false)
    private String hood;
    @Column(nullable = false)
    private String roof;
    @Column(nullable = false)
    private String mirrors;
}
