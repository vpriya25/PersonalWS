package com.carsearch.demo.dto;

import java.util.List;

public class CarModelList {
	private List<CarModel> carLst;
	private String carCategory;
	

	public List<CarModel> getCarLst() {
		return carLst;
	}

	public void setCarLst(List<CarModel> carLst) {
		this.carLst = carLst;
	}

	public String getCarCategory() {
		return carCategory;
	}

	public void setCarCategory(String carCategory) {
		this.carCategory = carCategory;
	}
	
	

}
