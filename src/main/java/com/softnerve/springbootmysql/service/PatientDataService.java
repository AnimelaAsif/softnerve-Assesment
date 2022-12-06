package com.softnerve.springbootmysql.service;

import com.softnerve.springbootmysql.entity.PatientInfoEntity;
import com.softnerve.springbootmysql.repo.PatientInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PatientDataService {

    @Autowired
    private PatientInfoRepository patientInfoRepository;

    public ArrayList<PatientInfoEntity> getInfo(){
        return (ArrayList<PatientInfoEntity>) patientInfoRepository.findAll();
    }

    public ArrayList<PatientInfoEntity> addInfo(PatientInfoEntity entity) {
        patientInfoRepository.save(entity);
        return (ArrayList<PatientInfoEntity>) patientInfoRepository.findAll();
    }

    public PatientInfoEntity updaate(PatientInfoEntity entity) {
        Optional<PatientInfoEntity> res = patientInfoRepository.findById(entity.getPatientId()).stream().findFirst();
        if (res.isPresent()){
            res.get().setPatientConcatNo(entity.getPatientConcatNo());
            res.get().setPatientName(entity.getPatientName());
            patientInfoRepository.save(res.get());
            return entity;
        }
        return null;
    }
    public ArrayList<PatientInfoEntity> deleteInfo(PatientInfoEntity entity) {
        patientInfoRepository.delete(entity);
        return (ArrayList<PatientInfoEntity>) patientInfoRepository.findAll();
    }
}
