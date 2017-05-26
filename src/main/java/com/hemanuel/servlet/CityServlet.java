package com.hemanuel.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hemanuel.controller.CityController;
import com.hemanuel.model.City;
import com.hemanuel.service.CityService;

public class CityServlet extends HttpServlet implements Servlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CityService service = new CityService();		
		CityController controller = new CityController();
		if (controller.isCity(req.getParameter("cityName"))){
			City city = new City();			
			city.setName(req.getParameter("cityName"));
			service.insertCity(city);			
		}
		RequestDispatcher disp;
    	disp = req.getRequestDispatcher("index.jsp");
   		disp.forward(req, resp);   
	}
	
}
