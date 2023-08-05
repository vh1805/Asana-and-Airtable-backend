package com.project.asanaAndAirtable.utils;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class AsanaUtils {
    private AsanaUtils() {

    }

    public static ResponseEntity<String> getResponseEntity(String message, HttpStatus httpStatus) {
        return new ResponseEntity<String>("{\"message\":\""+ message + "\"}",httpStatus);
    }
}
