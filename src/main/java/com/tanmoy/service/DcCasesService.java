package com.tanmoy.service;

import java.util.List;

import com.tanmoy.binding.Plan;

public interface DcCasesService {
	
	public Integer getCaseNumber(Integer appId);
	
	public List<Plan> getAllPlans();
	
	public String saveDcCases(Integer caseId , Integer PlanId);

}
