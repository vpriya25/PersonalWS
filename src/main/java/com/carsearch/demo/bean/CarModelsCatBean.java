package com.carsearch.demo.bean;

import java.util.List;


public class CarModelsCatBean {
	
	private List<CarModelBean> carLst;
	private String carCategory;
	

	public List<CarModelBean> getCarLst() {
		return carLst;
	}

	public void setCarLst(List<CarModelBean> carLst) {
		this.carLst = carLst;
	}

	public String getCarCategory() {
		return carCategory;
	}

	public void setCarCategory(String carCategory) {
		this.carCategory = carCategory;
	}

}
