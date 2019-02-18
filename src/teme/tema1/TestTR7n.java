package teme.tema1;

public class TestTR7n {

	public static double fahrenheitToCelsius(double temperature) {
		double tempInCelsius = (temperature - 32) * 5/9;
		return tempInCelsius;
		}
	
	public static void main(String[] args) {
		System.out.println(fahrenheitToCelsius(100));
		System.out.println(fahrenheitToCelsius(0));
		System.out.println(fahrenheitToCelsius(50));
	}
					
	
	
	
	
	
	}
