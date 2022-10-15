package com.tanmoy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tanmoy.entity.DcIncomeEntity;

public interface DcIncomeRepo extends JpaRepository<DcIncomeEntity, Integer> {

}
