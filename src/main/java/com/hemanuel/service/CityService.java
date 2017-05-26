package com.hemanuel.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hemanuel.model.City;

public class CityService {	
	public List<City> loadCities() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Forecast");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		return entityManager.createNamedQuery("getCities",City.class).getResultList();
	}
	
	public City insertCity(City city) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Forecast");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		City newCity = entityManager.merge(city);
		entityManager.getTransaction().commit();
		entityManager.close();
		return newCity;
	}
}
