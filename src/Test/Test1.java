package Test;

public class Test1 {

	public static double medieArmonica(int a, int b) {
		if(a + b >0) {
			return (2*a*b)/(a+b);
		}
		
		return 0;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(medieArmonica(5,5));
	}
}
