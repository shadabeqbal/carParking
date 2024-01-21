package com.project.carparking.repository;

import com.project.carparking.domain.ParkingSpot;
import com.project.carparking.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,String> {
}
