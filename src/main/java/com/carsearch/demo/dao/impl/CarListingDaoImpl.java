package com.carsearch.demo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.carsearch.demo.dto.CarModel;


@Repository
public class CarListingDaoImpl {
	
	@Autowired 
	private JdbcTemplate jdbctemplate;
	@Cacheable("carListing")
	public List<CarModel> carListing(){
		List<CarModel> carLst= new ArrayList<CarModel>();			
		carLst =jdbctemplate.query("SELECT * FROM AKUNDUR.CAR_MAKE_MODEL", new CarListMapper());
		return carLst;
	}
	
	
	private static final class CarListMapper implements RowMapper<CarModel> {
	    public CarModel mapRow(ResultSet rs, int rowNum) throws SQLException {
	    	CarModel carMod = new CarModel();
	    	carMod.setCarCategory(rs.getString("CAR_CATEGORY"));
			carMod.setCarDesc(rs.getString("CAR_DESC"));
			carMod.setMake(rs.getString("MAKE"));
			carMod.setModelName(rs.getString("MODEL_NAME"));
			carMod.setMakeModelCode(rs.getInt("MK_MDL_CD"));                       
	        return carMod;
	    }
	}

}


