<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Celsius to Fahrenheit</title>
</head>
<body>
	<h1>Celsius to Fahrenheit</h1>
	<form action= "cToFServlet" method= "post">
	Enter the temperature in celsius you want to convert to fahrenheit:
	<input type= "text" name= "userCelsius" size= "10">
	<input type= "submit" value= "Convert temperature" />
	</form>
	<a href="indexFToC.jsp">Convert from Fahrenheit to Celsius</a>
</body>
</html>