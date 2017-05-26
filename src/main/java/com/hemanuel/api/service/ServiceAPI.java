package com.hemanuel.api.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;
import com.hemanuel.api.model.Forecast;
import com.hemanuel.api.model.ForecastHeader;

public class ServiceAPI {
	private final String apiKey = "eb8b1a9405e659b2ffc78f0a520b1a46";
	
	public List<Forecast> loadForecast (String name) {
		URL url;
		List<Forecast> forecastList = null;		
		try {
			url = new URL("http://api.openweathermap.org/data/2.5/forecast?q="+name);			
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();			
			connection.setRequestProperty("X-Api-Key", apiKey);			
			connection.setRequestMethod("GET");			
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));			
			String inputLine;
			Gson gson = new Gson();
			ForecastHeader forecastHeader = new ForecastHeader();			
			while ((inputLine = in.readLine()) != null) {				
				forecastHeader = gson.fromJson(inputLine, ForecastHeader.class);				
			}			
			forecastList = forecastHeader.getList();			
		} catch (Exception e) {
			forecastList = null;
			e.printStackTrace();			
		} finally {
			return forecastList;
		}
	}
}
