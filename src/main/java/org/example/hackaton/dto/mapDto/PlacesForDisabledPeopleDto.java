package org.example.hackaton.dto.mapDto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.security.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlacesForDisabledPeopleDto {
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
