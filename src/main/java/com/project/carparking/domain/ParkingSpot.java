package com.project.carparking.domain;

import com.project.carparking.domain.converters.ObjectConverter;
import com.project.carparking.domain.converters.StringListConverter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "parkingspot")

public class ParkingSpot {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "parkingFloors")
    @Convert(converter = ObjectConverter.class)
    private Vehicle vehicle;

    @Column(name = "is_occupied")
    private Boolean isOccupied;

    @Column(name = "is_wheelchar_spot")
    private Boolean isWheelChairSpot;

}
