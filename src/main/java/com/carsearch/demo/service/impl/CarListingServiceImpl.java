package com.carsearch.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carsearch.demo.bean.CarModelBean;
import com.carsearch.demo.bean.CarModelsCatBean;
import com.carsearch.demo.dao.impl.CarListingDaoImpl;
import com.carsearch.demo.dto.CarModel;

@Service
public class CarListingServiceImpl {
	
	@Autowired
	CarListingDaoImpl carDao;

	public CarModelsCatBean carListingService(String category) {
		List<CarModel> carModelCmplLst= carDao.carListing();
		List<CarModelBean> sedans= new ArrayList<CarModelBean>();
		CarModelsCatBean carModels= new CarModelsCatBean();

		for(CarModel cm : carModelCmplLst){
			CarModelBean cbean= new CarModelBean();
			if(cm.getCarCategory().equalsIgnoreCase(category)){
			
			
				cbean.setCarDesc(cm.getCarDesc());
				cbean.setMake(cm.getMake());
				cbean.setMakeModelCode(cm.getMakeModelCode());
				cbean.setModelName(cm.getModelName());
				sedans.add(cbean);
			
			}
				
		}
		carModels.setCarCategory(category);
		carModels.setCarLst(sedans);
		
		 return carModels;
	}

}
