package com.carsearch.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.carsearch.demo.bean.CarModelsCatBean;
import com.carsearch.demo.service.impl.CarListingServiceImpl;


@RestController
public class CarListController {
	@Autowired
	CarListingServiceImpl carListService;
	@RequestMapping(path="/cars",method = RequestMethod.GET)
	public @ResponseBody CarModelsCatBean carsListing(@RequestParam("category") String category){
		return carListService.carListingService(category);
		 
	}

}
