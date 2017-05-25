package com.hemanuel.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="cityMB")
@RequestScoped
public class CityMB implements Serializable {
	String teste = "teste2";
	
	private static final long serialVersionUID = 1L;
	
	public String result() {
		return "MANUCA";
	}
	
	public String getTeste() {
		return teste;
	}
}
