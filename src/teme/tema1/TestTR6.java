package teme.tema1;
import java.util.Scanner;

public class TestTR6 {

	public static double avg(int a,int b) {
		
		return (a+b)/2D;
		
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(avg(a,b));
		
		sc.close();
	}
	
	
}
