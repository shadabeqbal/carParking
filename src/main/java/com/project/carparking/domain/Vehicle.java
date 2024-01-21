package com.project.carparking.domain;

import com.project.carparking.domain.converters.ObjectConverter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vehicle")

public class Vehicle {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "type")
    private VehicleType type;

    @Column(name = "vehicleNumber")
    private String vehicleNumber;

}
