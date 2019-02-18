package teme.tema1;
import java.util.Scanner;

public class TestTR5 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int ron = scanner.nextInt();
		
		float cursValutar = scanner.nextFloat();
		
		
		System.out.println(ron / cursValutar);
		System.out.println(ron % cursValutar);
		
		scanner.close();
		
	}

}
