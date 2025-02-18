package org.example.hackaton.dto.carserviceDto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarWashDto {

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
