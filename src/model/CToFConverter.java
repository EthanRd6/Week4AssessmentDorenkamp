package model;

/**
* @author Ethan Dorenkamp - edorenkamp
* CIS175 - Spring 2021
* Feb 18, 2021
*/
public class CToFConverter {

	private double celsius;
	private double fahrenheit;
	
	public CToFConverter() {
		super();
	}
	
	public CToFConverter(double celsius) {
		super();
		this.celsius = celsius;
		convertToFahrenheit(celsius);
	}

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

	public double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	
	public void convertToFahrenheit(double celsius) {
		celsius = celsius * 9;
		celsius = celsius / 5;
		celsius = celsius + 32;
		setFahrenheit(celsius);
	}

	@Override
	public String toString() {
		return "CToFConverter [celsius=" + celsius + ", fahrenheit=" + fahrenheit + "]";
	}
}
