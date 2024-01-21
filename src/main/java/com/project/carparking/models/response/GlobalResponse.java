package com.project.carparking.models.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Component
public class GlobalResponse {

    private boolean success;
    private String errorMessage;
    private int statusCode;
    private Object response;

}
