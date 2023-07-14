package com.yoon.car.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yoon.car.dao.CarManageDao;
import com.yoon.car.model.CarManageDto;
import com.yoon.car.service.CarManageService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CarManageServiceImplV1 implements CarManageService {

	final protected CarManageDao carManageDao;
	
	
	public CarManageServiceImplV1(CarManageDao carManageDao) {
		this.carManageDao = carManageDao;
	}

	@Override
	public List<CarManageDto> SelectAll() {
		// TODO Auto-generated method stub
		
		return carManageDao.SelectAll();
	}

	@Override
	public CarManageDto findBySEQ(long seq) {
		// TODO Auto-generated method stub
		return carManageDao.findBySEQ(seq);
	}

	@Override
	public int insert(CarManageDto dto) {
		// TODO Auto-generated method stub
		int result = carManageDao.insert(dto);
		log.debug("00인서트 : {}",dto.toString());
		return result;
	}

	@Override
	public int update(CarManageDto dto) {
		// TODO Auto-generated method stub
		return carManageDao.update(dto);
	}

}
