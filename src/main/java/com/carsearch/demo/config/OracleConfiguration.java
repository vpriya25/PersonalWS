package com.carsearch.demo.config;


import java.sql.SQLException;

import javax.sql.DataSource;
import javax.validation.constraints.NotNull;

import org.apache.commons.codec.binary.Base64;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import oracle.jdbc.pool.OracleDataSource;
 
@Configuration
@ConfigurationProperties("oracle")
public class OracleConfiguration {
    @NotNull
    private String username;
 
    @NotNull
    private String password;
 
    @NotNull
    private String url;
    
    @NotNull
    private String driver;
    
    public void setDriver(String driver) {
        this.driver = driver;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public void setPassword(String password) {
        this.password =  new String(Base64.decodeBase64(password));
    }
 
    public void setUrl(String url) {
        this.url = url;
    }
 
    @Bean
    DataSource dataSource() throws SQLException {
    	 
        OracleDataSource dataSource = new OracleDataSource();
        dataSource.setUser(username);
        dataSource.setPassword(password);
        dataSource.setURL(url);
        dataSource.setDriverType(driver);
        dataSource.setImplicitCachingEnabled(true);
        dataSource.setFastConnectionFailoverEnabled(true);
        return dataSource;
    }
}
