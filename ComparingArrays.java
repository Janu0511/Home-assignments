package week1.day2;

public class ComparingArrays {

	public static void main(String[] args) {
		
		int [] a = {3,2,11,4,6,7};
		int [] b = {1,2,8,4,9,7};
		
		for (int i = 0; i < b.length; i++) {
			
			for (int j = 0+1; j < b.length; j++) {
			
				if (a[i]==b[j]) {
					System.out.println("Matching numbers are:" +a[i]);
				} 

				}
			}
			
		}
		

	}

