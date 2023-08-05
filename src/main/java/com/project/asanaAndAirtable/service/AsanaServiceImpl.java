package com.project.asanaAndAirtable.service;

import com.project.asanaAndAirtable.constant.AsanaConstants;
import com.project.asanaAndAirtable.entity.Asana;
import com.project.asanaAndAirtable.repository.AsanaRepository;
import com.project.asanaAndAirtable.utils.AsanaUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsanaServiceImpl implements AsanaService {
    @Autowired
    private AsanaRepository asanaRepository;

    @Override
    public ResponseEntity<String> createAsanaTask(Asana asana) {
        try{
            asanaRepository.save(asana);
            return AsanaUtils.getResponseEntity(AsanaConstants.ASANA_TASK_CREATED,HttpStatus.OK);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return AsanaUtils.getResponseEntity(AsanaConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public List<Asana> getAllTask() {
        List<Asana> asanas = asanaRepository.findAll();
        return asanas;
    }
}
