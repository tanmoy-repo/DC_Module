package com.tanmoy.binding;

import java.time.LocalDate;

import lombok.Data;

@Data
public class DcChildren {
	
	private Integer caseNumber;
	 
	private LocalDate childrenDob;
	
	private Long childrenSsn;

}
