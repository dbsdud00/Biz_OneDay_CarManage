package com.yoon.car.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CarManageDto {
	private long cm_seq; //BIGINT	NOT NULL,
	private String cm_div;	//VARCHAR(100)	NULL,
	private String cm_stdate;	//VARCHAR(10)	NULL,
	private int cm_stKM;	//INT	NULL,
	private String cm_stTIME;	//VARCHAR(8)	NULL,
	private String cm_arrDate;	//VARCHAR(10)	NULL,
	private String cm_arrTime;	//VARCHAR(8)	NULL,
	private int cm_arrKM;	//INT	NULL,
	private String cm_place;	//VARCHAR(100)	NULL,
	private int cm_cost;	//INT	NULL
}
