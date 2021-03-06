package com.carsearch.demo.dto;

public class CarTrimsDto {
	
	/*MK_MDL_CD	NUMBER(10,0)
	MAX_SEATING	VARCHAR2(10 BYTE)
	DRIVE_TRAIN	VARCHAR2(10 BYTE)
	CAR_TRIM_ID	NUMBER(10,0)
	CAR_TRIM	VARCHAR2(30 BYTE)
	CAR_PRICE	NUMBER(10,0)
	CAR_ENG	VARCHAR2(10 BYTE)
	CAR_COLORS	VARCHAR2(100 BYTE)*/
	
	private int makeModelCode;
	private String maxSeats;
	private String driveTrain;
	private int carTrimID;
	private String carTrim;
	private long carPrice;
	private String carEngine;
	private String carColors;
	
	public int getMakeModelCode() {
		return makeModelCode;
	}
	public void setMakeModelCode(int makeModelCode) {
		this.makeModelCode = makeModelCode;
	}
	public String getMaxSeats() {
		return maxSeats;
	}
	public void setMaxSeats(String maxSeats) {
		this.maxSeats = maxSeats;
	}
	public String getDriveTrain() {
		return driveTrain;
	}
	public void setDriveTrain(String driveTrain) {
		this.driveTrain = driveTrain;
	}
	public int getCarTrimID() {
		return carTrimID;
	}
	public void setCarTrimID(int carTrimID) {
		this.carTrimID = carTrimID;
	}
	public String getCarTrim() {
		return carTrim;
	}
	public void setCarTrim(String carTrim) {
		this.carTrim = carTrim;
	}
	public long getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(long carPrice) {
		this.carPrice = carPrice;
	}
	public String getCarEngine() {
		return carEngine;
	}
	public void setCarEngine(String carEngine) {
		this.carEngine = carEngine;
	}
	public String getCarColors() {
		return carColors;
	}
	public void setCarColors(String carColors) {
		this.carColors = carColors;
	}
	
	

}
