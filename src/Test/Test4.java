package Test;

public class Test4 {
	
	public static void combinations(String s, int n) {
		combinations("",s,n);

	}
	public static void combinations(String prefix, String s, int n){
		if(n == 1){
			for(int i =0;i<s.length();i++)
				System.out.print(prefix+s.charAt(i) + " ");
			}
			for(int i = 0;i<s.length();i++)
			combinations(prefix+s.charAt(i),s.substring(i+1),n-1);
		}
	
	public static void main(String[] args) {
		combinations("abc",2);
	}
  // La asta m-am ajutat cu google, nu prea mergea cum am vrut eu
}
