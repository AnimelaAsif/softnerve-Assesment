package com.softnerve.springbootmysql.repo;

import com.softnerve.springbootmysql.entity.PatientInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientInfoRepository extends JpaRepository<PatientInfoEntity,Long> {
}
