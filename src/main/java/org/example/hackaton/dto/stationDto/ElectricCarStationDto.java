package org.example.hackaton.dto.stationDto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ElectricCarStationDto {

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
