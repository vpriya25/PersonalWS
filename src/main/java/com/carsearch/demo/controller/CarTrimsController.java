package com.carsearch.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.carsearch.demo.bean.CarTrimsBean;
import com.carsearch.demo.service.impl.TrimListingsServiceImpl;

@RestController
public class CarTrimsController {
	
	@Autowired
	TrimListingsServiceImpl trimListingsServiceImpl;
	
	@RequestMapping(path="/trims", method=RequestMethod.GET)
	public @ResponseBody List<CarTrimsBean> trimList(@RequestParam("makeModelId") int makeModelId){
		
		return trimListingsServiceImpl.getTrimsByID(makeModelId);
	}

}
