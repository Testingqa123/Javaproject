package testpackage;
public class JavaPascalTriangle 
{

	    public static void main(String[] args) {
// hkjhkjhkjh
	    	// hjkhjkhkjlhkjhk
	        int rows = 10;
         

	        for(int i =0;i<rows;i++) {

	            int number = 1;

	            System.out.format("%"+(rows-i)*2+"s","");

	            for(int j=0;j<=i;j++) {

	                 System.out.format("%4d",number);

	                 number = number * (i - j) / (j + 1);

	                 // This is my first commit

	            }

	            System.out.println();

	        }

	    }
	    
}

	    