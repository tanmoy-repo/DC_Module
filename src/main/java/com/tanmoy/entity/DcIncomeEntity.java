package com.tanmoy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="DC_INCOME")
@Data
public class DcIncomeEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer incomeId;

	private Integer caseNumber;

	private Integer empIncome;
	
	private Integer rentIncome;

	private Integer propertyIncome;

}
