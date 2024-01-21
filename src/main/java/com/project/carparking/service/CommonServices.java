package com.project.carparking.service;

import com.project.carparking.models.response.GlobalResponse;
import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CommonServices {
    private static final Logger log = LoggerFactory.getLogger(CommonServices.class);
    private static final Logger exceptionLogger = LoggerFactory.getLogger("ExceptionLog");
    private static final Logger errorMessagesLogger = LoggerFactory.getLogger("Error Messages");

    public GlobalResponse specialStack(){
        GlobalResponse globalResponse = null;

        globalResponse = new GlobalResponse(true,"",HttpStatus.SC_OK,"");
        return globalResponse;
    }
}
