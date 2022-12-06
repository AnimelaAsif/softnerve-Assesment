package com.softnerve.springbootmysql.controller;

import com.softnerve.springbootmysql.entity.PatientInfoEntity;
import com.softnerve.springbootmysql.service.PatientDataService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/patient")
public class PatientDataController {

    @Autowired
    private PatientDataService patientDataService;

    @GetMapping
    private ArrayList<PatientInfoEntity> getInfo(){
        return patientDataService.getInfo();
    }

    @PostMapping
    private ArrayList<PatientInfoEntity> addInfo(@NotNull @RequestBody PatientInfoEntity entity){
        return patientDataService.addInfo(entity);
    }
    @RequestMapping(method = RequestMethod.PUT)
    private PatientInfoEntity updateInfo(@NotNull @RequestBody PatientInfoEntity entity){
        return patientDataService.updaate(entity);
    }
    @RequestMapping(method = RequestMethod.DELETE)
    private ArrayList<PatientInfoEntity> deleteInfo(@NotNull @RequestBody PatientInfoEntity entity){
        return patientDataService.deleteInfo(entity);
    }
}
