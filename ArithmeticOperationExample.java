import java.util.Scanner;

public class ArithmeticOperationExample {
    public static void main(String[] args) {

        Scanner ed=new  Scanner(System.in);
        int x,y;
        int sumResult,mulResult,dvdResult,subtractResult;
        System.out.print("Enter First Numbers = ");
        x=ed.nextInt();
        System.out.print("Enter Second Numbers = ");
        y=ed.nextInt();
        sumResult=x+y;
        mulResult=x*y;
        dvdResult=x/y;
        subtractResult=x-y;
        
        System.out.println("Results");
        System.out.println("Addition = "+sumResult);
        System.out.println("Multiplication = "+mulResult);
        System.out.println("Division = "+dvdResult);
        System.out.println("Subtraction = "+subtractResult);

    }
}

class PalindromeExample{  
    public static void main(String args[]){  
     int r,sum=0,temp;    
     int n=454;//It is the number variable to be checked for palindrome  
     
     temp=n;    
     while(n>0){    
      r=n%10;  //getting remainder  
      sum=(sum*10)+r;    
      n=n/10;    
     }    
     if(temp==sum)    
      System.out.println("palindrome number ");    
     else    
      System.out.println("not palindrome");    
   }  
   }  

   
// divisible by 23 and 10 to 100 

class GFG{
	
	// Result function with N
	static void result(int N)
	{	
		// iterate from 0 to N
		for (int num = 0; num < N; num++)
		{	
			// Short-circuit operator is used
			if (num % 23 == 0 && num % 10 == 0)
				System.out.print(num + " ");
		}
	}
	
	// Driver code
	public static void main(String []args)
	{
		// input goes here
		int N = 100;
		
		// Calling function
		result(N);
	}
}
