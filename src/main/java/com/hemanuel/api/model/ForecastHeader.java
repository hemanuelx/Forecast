package com.hemanuel.api.model;

import java.util.List;

public class ForecastHeader {
	private String cod;
	private String message;
	private String cnt;
	private List<Forecast> list;
	private CityAPI cityAPI;
	
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCnt() {
		return cnt;
	}
	public void setCnt(String cnt) {
		this.cnt = cnt;
	}
	public List<Forecast> getList() {
		return list;
	}
	public void setList(List<Forecast> list) {
		this.list = list;
	}
	public CityAPI getCityAPI() {
		return cityAPI;
	}
	public void setCityAPI(CityAPI cityAPI) {
		this.cityAPI = cityAPI;
	}
}
