package com.project.asanaAndAirtable.service;

import com.project.asanaAndAirtable.entity.Asana;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AsanaService {
    public ResponseEntity<String> createAsanaTask(Asana asana);
    public List<Asana> getAllTask();
}
