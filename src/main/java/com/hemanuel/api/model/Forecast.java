package com.hemanuel.api.model;

import java.util.List;

public class Forecast {
	private String dt;
	private ForecastMain main;
	private List<Weather> weather;
	private Clouds clouds;
	private Wind wind;
	private Sys sys;
	private String dt_txt;
	
	
	public List<Weather> getWeather() {
		return weather;
	}
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	public ForecastMain getMain() {
		return main;
	}
	public void setMain(ForecastMain main) {
		this.main = main;
	}
	public Clouds getClouds() {
		return clouds;
	}
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}
	public Wind getWind() {
		return wind;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	public Sys getSys() {
		return sys;
	}
	public void setSys(Sys sys) {
		this.sys = sys;
	}
	public String getDt_txt() {
		return dt_txt;
	}
	public void setDt_txt(String dt_txt) {
		this.dt_txt = dt_txt;
	}
}
