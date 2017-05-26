<%@page import="com.hemanuel.model.City"%>
<%@page import="com.hemanuel.service.CityService"%>
<html>
<head></head>
<body>
<a href="newCity.jsp">New City</a>
<form>
	<table>
		<tr>
			<td>ID</td> 
			<td>Name</td>
		</tr>
		<% 
			CityService service = new CityService();
			for	(City city : service.loadCities()) {
		%>
				<tr>					 
					<td> <%= city.getId()  %></td>
					<td><%= city.getName()  %></output></td>														
					<td><a href="forecast.jsp?name=<%=city.getName()%>">Forecast</a></td>
				</tr>	
		<% } %>	
	</table>
</form>
</body>
</html>