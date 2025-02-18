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
public class CarWash {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @Column(nullable = false)
    private String name;
    private BigDecimal longitude;
    private BigDecimal latitude;
    @Column(nullable = false)
    private String cashingcachineAvaibility;
    @Column(nullable = false)
    private String candcashingAvaibility;
    @Column(nullable = false)
    private String carcategory;
    @Column(nullable = false)
    private String price;

}
