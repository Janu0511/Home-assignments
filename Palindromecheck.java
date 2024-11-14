package week1.day2;



public class Palindromecheck {

	public static void main(String[] args) {
          int input = 121; 
          int output=0;
          int originalnumber=input;
          
          for (int i = input; i >0; i=i/10) {
			
        	  
        	  output=(output*10) + (i%10);
		}
         
          
          if (originalnumber==output) {
			
        	  System.out.println("Given number is palindrome");
		}
	}}

     

