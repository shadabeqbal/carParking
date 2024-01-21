package com.project.carparking.controllers;

import com.project.carparking.models.request.VehicleInput;
import com.project.carparking.models.response.GlobalResponse;
import com.project.carparking.service.CommonServices;
import com.project.carparking.service.ParkingLot;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/stacks", produces = MediaType.APPLICATION_JSON_VALUE)

public class ParkingLotController {

    ParkingLot parkingLot;

    @RequestMapping(method = RequestMethod.POST,value = "/vehicleEntry")
    public ResponseEntity<?> vehicleEntry(@RequestParam VehicleInput v) {
        GlobalResponse globalResponse = parkingLot.vehicleEntry(v);
        return ResponseEntity.status(globalResponse.getStatusCode()).body(globalResponse);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/vehicleExit")
    public ResponseEntity<?> vehicleExit(@RequestParam String ticketNumber) {
        GlobalResponse globalResponse = parkingLot.vehicleExit(ticketNumber);
        return ResponseEntity.status(globalResponse.getStatusCode()).body(globalResponse);
    }
}
