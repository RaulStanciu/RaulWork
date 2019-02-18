package teme.tema1;

public class TestTR9 {
	
	public static boolean inPitagoraRelation(int a, int b, int c) {
		if (a*a + b*b == c*c && (a+b+c)%10 == 0)
			return true;
				
		return false;
		
	}
	public static void main(String[] args) {
		System.out.println(inPitagoraRelation(3, 4, 5));
		System.out.println(inPitagoraRelation(5, 12, 13));
		System.out.println(inPitagoraRelation(1, 2, 3));
		
	}

}
