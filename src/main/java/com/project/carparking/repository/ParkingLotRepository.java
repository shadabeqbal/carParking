package com.project.carparking.repository;

import com.project.carparking.domain.ParkingFloors;
import com.project.carparking.domain.ParkingLot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingLotRepository extends JpaRepository<ParkingLot,String> {
}
