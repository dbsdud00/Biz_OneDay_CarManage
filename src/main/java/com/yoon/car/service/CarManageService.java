package com.yoon.car.service;

import java.util.List;

import com.yoon.car.model.CarManageDto;

public interface CarManageService {
	public List<CarManageDto> SelectAll();
	public CarManageDto findBySEQ(long seq);
	public int insert(CarManageDto dto);
	public int update(CarManageDto dto);
}
