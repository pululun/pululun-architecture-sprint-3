package org.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(DeviceNotFound.class)
    public ResponseEntity<String> deviceNotFoundHandlerException(DeviceNotFound deviceNotFound) {
        return new ResponseEntity<>(deviceNotFound.getMessage(), HttpStatus.NOT_FOUND);
    }

}
