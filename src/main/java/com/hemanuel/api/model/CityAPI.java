package com.hemanuel.api.model;

public class CityAPI {
	private int id;
	private String name;
	private String country;	
	private CoordinateAPI coordinate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public CoordinateAPI getCoordinate() {
		return coordinate;
	}
	public void setCoordinate(CoordinateAPI coordinate) {
		this.coordinate = coordinate;
	}
		
}
