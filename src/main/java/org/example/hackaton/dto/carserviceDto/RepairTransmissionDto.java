package org.example.hackaton.dto.carserviceDto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RepairTransmissionDto {

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
