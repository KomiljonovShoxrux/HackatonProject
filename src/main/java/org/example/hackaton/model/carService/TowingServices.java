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
public class TowingServices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private BigDecimal longitude;
    private BigDecimal latitude;
    @Column(nullable = false)
    private String phonenumber;
    @Column(nullable = false)
    private String price;
}
