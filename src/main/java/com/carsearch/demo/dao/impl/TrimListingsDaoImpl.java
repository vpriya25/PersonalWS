package com.carsearch.demo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.carsearch.demo.dto.CarTrimsDto;

@Repository
public class TrimListingsDaoImpl {
	
	@Autowired
	private JdbcTemplate jdbctempl;
	
	public List<CarTrimsDto> getAllTrims(int makeModelId){
		
		List<CarTrimsDto> carTrimLst=this.jdbctempl.query("SELECT * FROM AKUNDUR.CAR_TRIM_DTL WHERE MK_MDL_CD=?", new Object[] {makeModelId} , new CarTrimMapper());
		return carTrimLst;
	}

	private static class CarTrimMapper implements RowMapper<CarTrimsDto>{

		@Override
		public CarTrimsDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			CarTrimsDto dto= new CarTrimsDto();
			dto.setCarColors(rs.getString("CAR_COLORS"));
			dto.setCarEngine(rs.getString("CAR_ENG"));
			dto.setCarPrice(rs.getLong("CAR_PRICE"));
			dto.setCarTrim(rs.getString("CAR_TRIM"));
			dto.setCarTrimID(rs.getInt("CAR_TRIM_ID"));
			dto.setDriveTrain(rs.getString("DRIVE_TRAIN"));
			dto.setMaxSeats(rs.getString("MAX_SEATING"));
			dto.setMakeModelCode(rs.getInt("MK_MDL_CD"));
			return dto;
		}
		
	}
}
