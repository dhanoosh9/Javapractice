package sample.exceptionhandling;

public class ExpHandlng3 {
	
	 public static void checkNum(int num) {  
	        if (num < 1) {  
	            throw new ArithmeticException("\nNumber is negative, cannot calculate square");  
	        }  
	        else {  
	            System.out.println("Square of " + num + " is " + (num*num));  
	        }  
	    }  
	 
	 public static void main(String[] args) {
		
		 checkNum(2);
		 checkNum(6);
         System.out.println("Rest of the code..");  
		 
	}
}
