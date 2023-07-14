package com.yoon.car.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.yoon.car.model.CarManageDto;

public interface CarManageDao {
	
	@Select("SELECT * FROM tbl_mcm")
	public List<CarManageDto> SelectAll();
	
	@Select("SELECT * FROM tbl_mcm WHERE cm_seq = #{seq}")
	public CarManageDto findBySEQ(long seq);
	
	public int insert(CarManageDto dto);
	
	public int update(CarManageDto dto);
}
