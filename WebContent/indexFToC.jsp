<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fahrenheit to Celsius</title>
</head>
<body>
	<h1>Fahrenheit to Celsius</h1>
	<form action= "fToCServlet" method= "post">
	Enter the temperature in fahrenheit you want to convert to celsius:
	<input type= "text" name= "userFahrenheit" size= "10">
	<input type= "submit" value= "Convert temperature" />
	</form>
	<a href="indexCToF.jsp">Convert from Celsius to Fahrenheit</a>
</body>
</html>