package org.example.hackaton.dto.mapDto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingDto {

    @Column(unique = true, nullable = false)
    private String parkingname;
    @Column(nullable = false)
    private String size;
    @Column(nullable = false)
    private String placeForDisabledPeople;
    @Column(nullable = false)
    private String freeParking;
    @Column(nullable = false)
    private String pricinessParking;
}
