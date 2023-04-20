package org.example.jdbc.persistence.manager.dao;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

@Data
public class City {
    private int id;
    private String name;
    private String countrycode;
    private String district;
    private BigDecimal population;

    public City(){}
    public City(ResultSet result){
        try{
            this.id = result.getInt("ID");
            this.name = result.getString("name");
            this.countrycode = result.getString("CountryCode");
            this.district = result.getString("District");
            this.population = result.getBigDecimal("Population");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

}
