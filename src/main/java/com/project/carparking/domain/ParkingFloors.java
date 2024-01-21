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
@Table(name = "parkingfloors")

public class ParkingFloors {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "parkingFloors")
    @Convert(converter = ObjectConverter.class)
    private List<ParkingSpot> parkingSpots;

    @Column(name = "floorNumber")
    private Integer floorNumber;

    @Column(name = "freeSpots")
    private Integer freeSpots;

}
