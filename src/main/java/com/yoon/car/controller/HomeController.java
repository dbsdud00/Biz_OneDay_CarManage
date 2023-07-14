package com.yoon.car.controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yoon.car.model.CarManageDto;
import com.yoon.car.service.CarManageService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	
	private final CarManageService carManageService;


	public HomeController(CarManageService carManageService) {
		this.carManageService = carManageService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		List<CarManageDto> cmlist = carManageService.SelectAll();
		model.addAttribute("CMLIST",cmlist);
		return "home";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String insert(@ModelAttribute CarManageDto dto) {
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		dto.setCm_stdate(dateFormat.format(date));
		dto.setCm_stTIME(timeFormat.format(date));
		carManageService.insert(dto);
		return "redirect:/";
	}
	
	@RequestMapping(value="/update" , method=RequestMethod.GET)
	public String update(long id , Model model) {
		CarManageDto dto = carManageService.findBySEQ(id);
		model.addAttribute("MCM",dto);
		model.addAttribute("BODY", "UPDATE");
		return "home";
	}
	
	@RequestMapping(value="/update" , method=RequestMethod.POST)
	public String update(@ModelAttribute CarManageDto dto, long id) {
		dto.setCm_seq(id);
		log.debug("업데이트 : {}",dto.toString());
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		dto.setCm_arrDate(dateFormat.format(date));
		dto.setCm_arrTime(timeFormat.format(date));
		int result = carManageService.update(dto);
		log.debug(result+"");
		return "redirect:/";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
