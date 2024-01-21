package com.project.carparking.repository;

import com.project.carparking.domain.ParkingFloors;
import com.project.carparking.domain.ParkingSpot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpot,String> {
}
