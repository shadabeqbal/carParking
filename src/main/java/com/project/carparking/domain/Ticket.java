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
@Table(name = "ticket")

public class Ticket {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "vehicle")
    @Convert(converter = ObjectConverter.class)
    private Vehicle vehicle;

    @Column(name = "parkingSpot")
    @Convert(converter = ObjectConverter.class)
    private ParkingSpot parkingSpot;

}
