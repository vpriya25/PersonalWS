package com.carsearch.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carsearch.demo.bean.CarTrimsBean;
import com.carsearch.demo.dao.impl.TrimListingsDaoImpl;
import com.carsearch.demo.dto.CarTrimsDto;

@Service
public class TrimListingsServiceImpl {
	
	@Autowired
	TrimListingsDaoImpl trimListingsDaoImpl;
	
	public List<CarTrimsBean> getTrimsByID(int makeModelId){
		
		List<CarTrimsDto> carTrims= trimListingsDaoImpl.getAllTrims(makeModelId);
		List<CarTrimsBean> carTrimsById= new ArrayList<CarTrimsBean>();
		for(CarTrimsDto ct: carTrims){
			CarTrimsBean trimBean= new CarTrimsBean();
			trimBean.setCarColors(ct.getCarColors());
			trimBean.setCarEngine(ct.getCarEngine());
			trimBean.setCarPrice(ct.getCarPrice());
			trimBean.setCarTrim(ct.getCarTrim());
			trimBean.setCarTrimID(ct.getCarTrimID());
			trimBean.setDriveTrain(ct.getDriveTrain());
			trimBean.setMakeModelCode(ct.getMakeModelCode());
			trimBean.setMaxSeats(ct.getMaxSeats());
			carTrimsById.add(trimBean);
		}
		return carTrimsById;
	}

}
