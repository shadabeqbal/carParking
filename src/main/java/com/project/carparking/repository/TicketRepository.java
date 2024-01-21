package com.project.carparking.repository;

import com.project.carparking.domain.ParkingFloors;
import com.project.carparking.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,String> {
}
