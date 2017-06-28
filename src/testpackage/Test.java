

/*public class Test {
    public static void main(String[] args) {
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
    }
}*/

/*package testpackage;
import java.util.Scanner;


	// Java program to find sum of digits of a number

	public class Test {

	    public static void main(String[] args) {

	        Scanner object = new Scanner(System.in);

	 

	        System.out.print("Please a number: ");

	        int number = object.nextInt();

	 

	        int sumOfDigits = findSumOfDigits(number);

	        System.out.println("Sum of digits of " + number + " is " + sumOfDigits);

	 

	        object.close();

	    }

	 

	    // Find sum of digits of a number

	    public static int findSumOfDigits(int number) {

	        int sum = 0;

	        while (number > 0) {

	            int digit = number % 10;

	            number = number / 10;

	            sum += digit;

	        }

	        return sum;
    }
}
*/	


/*
package testpackage;
import java.util.Scanner;
 
public class Test
{
   public static void main(String args[])
   {
      int a;
      float b;
      String s;
 
      Scanner in = new Scanner(System.in);
     
      System.out.println("Enter a string");
      s = in.nextLine();
      System.out.println("You entered string "+s);
 
      System.out.println("Enter an integer");
      a = in.nextInt();
      System.out.println("You entered integer "+a);
 
      System.out.println("Enter a float");
      b = in.nextFloat();
      System.out.println("You entered float "+b);   
   }
}
*/
/*
import java.io.FileNotFoundException;
import java.io.IOException;
*/
//StringReverseExample

/*public class Test{
	
	//original string
	String str= "sony is going to introduce Internet TV soon";
	System.out.println("Original String: " + str);
	
	//reverse string using string buffer
	String reverseStr = new StringBuffer(str).reverse().toString();
	System.out.println("reverse string using stringbuffer: =" + reverseStr);
	
	//iterative method to reverse string in java
	reverseStr = reverse(str);
    System.out.println("Reverse String in Java using Iteration: " + reverseStr);

  //recursive method to reverse String in Java
    reverseStr = reverseRecursively(str);
    System.out.println("Reverse String in Java using Recursion: " + reverseStr);

}
*/
package testpackage;
import java.awt.Desktop;
import java.net.URI;

public class Test {

    public static void main(String[] args) throws Exception {
    	
        String url = "http://stackoverflow.com";
        

        if (Desktop.isDesktopSupported()) {
            // Windows
            Desktop.getDesktop().browse(new URI(url));
        } else {
            // Ubuntu
            Runtime runtime = Runtime.getRuntime();
            runtime.exec("/usr/bin/firefox -new-window " + url);
        }
    }
}




/*public class Test {

   public static void main(String[] args) {

      // print when the program starts
      System.out.println("Program starting...");

      // get the current runtime assosiated with this process
      Runtime run = Runtime.getRuntime();

      // print the current free memory for this runtime
      System.out.println("" + run.freeMemory());
   }
}*/

//Program to open browser using java

/*package bestInsurance;

import java.awt.Desktop;
import java.net.URI;
import java.awt.*;
import java.awt.event.*;



public class Guestquote {
	      
	public static void main(String[] args) throws Exception {
	
		
	
		
		if(Desktop.isDesktopSupported()) {
		
		{
		  Desktop.getDesktop().browse(new URI("http://log.quad1test.com:2222"));
		  
		}
		}
	
}
}*/













