package com.hemanuel.controller;

import java.util.List;

import com.hemanuel.api.service.ServiceAPI;
import com.hemanuel.model.City;
import com.hemanuel.service.CityService;

public class CityController {
	//Verify if the city exists in the API
	public boolean isCity(String cityName) {
		try {
			ServiceAPI service = new ServiceAPI();			 
			if (service.loadForecast(cityName).size() > 0 ){				
				return true;				
			}
			return false;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
}
