package week1.day2;

import java.util.Arrays;

public class FindMissingElements {

	public static void main(String[] args) {
		
		int []num= {1,4,3,2,8,6,7};
		
		Arrays.sort(num); 
		for (int i = 0; i < num.length-1; i++) {
			if (num[i+1]!=num[i]+1) {
			
			int	output = num[i]+1;
			System.out.println("Missing number is:" +output   );
			break;
			}
			}
		}
}
					
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	

	

	


