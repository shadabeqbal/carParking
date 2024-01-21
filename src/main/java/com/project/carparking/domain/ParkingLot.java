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
@Table(name = "parkinglot")

public class ParkingLot {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "parkingFloors")
    @Convert(converter = ObjectConverter.class)
    private List<ParkingFloors> parkingFloors;

    @Column(name = "entryGate")
    private String entryGate;

    @Column(name = "exitGate")
    private String exitGate;

    @Column(name = "entryDateTime")
    private String entryDateTime;

    @Column(name = "exitDateTime")
    private String exitDateTime;

    @Column(name = "mobile")
    @Convert(converter = StringListConverter.class)
    private Set<String> mobile;

}
