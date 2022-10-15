package com.tanmoy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tanmoy.entity.DcCasesEntity;

public interface DcCasesRepo extends JpaRepository<DcCasesEntity, Integer> {

}
