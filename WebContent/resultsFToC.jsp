<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
<p>${userTempF.getFahrenheit()} degrees Fahrenheit is the same as: <br />
${userTempF.getCelsius()} degrees Celsius <br />
</p>
<a href="indexCToF.jsp">Convert from Celsius to Fahrenheit</a>
<a href="indexFToC.jsp">Convert from Fahrenheit to Celsius</a>
</body>
</html>