package model;

/**
* @author Ethan Dorenkamp - edorenkamp
* CIS175 - Spring 2021
* Feb 18, 2021
*/
public class FToCConverter {

	private double fahrenheit;
	private double celsius;
	
	public FToCConverter() {
		super();
	}

	public FToCConverter(double fahrenheit) {
		super();
		this.fahrenheit = fahrenheit;
		convertToCelsius(fahrenheit);
	}

	public double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	public void convertToCelsius(double fahrenheit) {
		fahrenheit = fahrenheit - 32;
		fahrenheit = fahrenheit * 5;
		fahrenheit = fahrenheit / 9;
		setCelsius(fahrenheit);
	}

	@Override
	public String toString() {
		return "FToCConverter [fahrenheit=" + fahrenheit + ", celsius=" + celsius + "]";
	}
}
