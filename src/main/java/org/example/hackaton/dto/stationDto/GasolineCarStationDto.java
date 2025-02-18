package org.example.hackaton.dto.stationDto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GasolineCarStationDto {
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
