package com.hemanuel.api.model;

public class CityAPI {
	private int id;
	private String name;		
	private CoordinateAPI coord;
	private String country;
	
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
	public CoordinateAPI getCoord() {
		return coord;
	}
	public void setCoord(CoordinateAPI coord) {
		this.coord = coord;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
