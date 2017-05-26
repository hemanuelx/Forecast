<%@page import="com.hemanuel.api.model.Forecast"%>
<%@page import="java.util.List"%>
<%@page import="com.hemanuel.api.service.ServiceAPI"%>
<html>
<head>
</head>
<body>
<%= request.getParameter("name") %>
<%
ServiceAPI serviceAPI = new ServiceAPI();	
List<Forecast> forecastList = serviceAPI.loadForecast(request.getParameter("name"));
String changeDay = null;
%>

<table>	
	<%
		for (Forecast forecast : forecastList) {			   
	%>
			<tr>
				<td>
				<b>Date:</b> <i><%=forecast.getDt_txt() %></i>
				</td>		
				<td>
					<b>Min:</b> <i><%= forecast.getMain().getTemp_min()%> </i>
					<b>Max:</b> <i><%= forecast.getMain().getTemp_max()%> </i>										
					<b>Humidity:</b> <i><%= forecast.getMain().getHumidity()%> </i>
					<b>Wheater:</b> <i><%= forecast.getWeather().get(0).getDescription()%> </i>
				</td>
			</tr>
	<% } %>
</table>


<a href="index.jsp">Voltar</a>
</body>
</html>