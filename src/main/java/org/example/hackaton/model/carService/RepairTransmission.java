package org.example.hackaton.model.carService;

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
public class RepairTransmission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @Column(nullable = false)
    private String storename;
    private BigDecimal longitude;
    private BigDecimal latitude;
    @Column(nullable = false)
    private String transmissionName;
    @Column(nullable = false)
    private int transmissionAvaiability;
    @Column(nullable = false)
    private String price;
}
