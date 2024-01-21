package com.project.carparking.service;

import com.project.carparking.domain.Ticket;
import com.project.carparking.domain.Vehicle;
import com.project.carparking.models.request.VehicleInput;
import com.project.carparking.models.response.GlobalResponse;
import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ParkingLot {
    private static final Logger log = LoggerFactory.getLogger(ParkingLot.class);
    private static final Logger exceptionLogger = LoggerFactory.getLogger("ExceptionLog");
    private static final Logger errorMessagesLogger = LoggerFactory.getLogger("Error Messages");

    public GlobalResponse vehicleEntry(VehicleInput v){
        GlobalResponse globalResponse = null;
        String currentDateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        Ticket ticket = new Ticket();
        globalResponse = new GlobalResponse(true,"",HttpStatus.SC_OK,"");
        return globalResponse;
    }

    public GlobalResponse vehicleExit(String ticketNumber){
        GlobalResponse globalResponse = null;

        globalResponse = new GlobalResponse(true,"",HttpStatus.SC_OK,"");
        return globalResponse;
    }
}
