package teme.tema1;
import java.util.Scanner;

public class TestTR4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int eur = scanner.nextInt();
		
		float cursValutar = scanner.nextFloat();
		
		System.out.println(eur * cursValutar);
		
		scanner.close();
	}

}
