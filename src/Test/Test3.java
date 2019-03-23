package Test;

public class Test3 {
	public static int next(int[] arr, int n) {
		int num = n;
		for(int i = 0; i<arr.length - 1; i++) {
			
			 if( num == arr.length -1) {
					return -1;
				}
			 
			if(arr[i] == num) {
				return arr[i+1];
			}
			
		}
		
		return -2;
	}
	
	public static void main(String[] args) {
		System.out.println(next(new int[]{1,5,7,2,4}, 7));
		System.out.println(next(new int[]{1,5,7,2,4}, 4));
		System.out.println(next(new int[]{1,5,7,2,4}, 14));
	}

}
