package com.project.asanaAndAirtable.controller;

import com.project.asanaAndAirtable.constant.AsanaConstants;
import com.project.asanaAndAirtable.entity.Asana;
import com.project.asanaAndAirtable.service.AsanaService;
import com.project.asanaAndAirtable.utils.AsanaUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/asana")
@CrossOrigin("*")
public class AsanaController {
    @Autowired
    private AsanaService asanaService;

    @PostMapping("/create_task")
    public ResponseEntity<String> createAsanaTask(@RequestBody Asana asana) {
        try {
            return asanaService.createAsanaTask(asana);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return AsanaUtils.getResponseEntity(AsanaConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/")
    public ResponseEntity<List<Asana>> getAllTask(){
        return ResponseEntity.ok(asanaService.getAllTask());
    }
}
