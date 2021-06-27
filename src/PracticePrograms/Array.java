//Declare 1-D Array of integer of Length 10, but Empty

package PracticePrograms;

public class Array {

	public static void main(String[] args) {
		
		int[] a;            //Declare Array
		a= new int [10];  //Initialize Array
        for (int i = 0; i < a.length; i++) 
        	
        {         	
            System.out.print(a[i]);
	    }

       /*
           */


        /*  Interview question (cars[-0] = cars[0] only)
         
		String[] cars = {"abc","def","ghi","jkl"};
       System.out.println(cars.length);
       
       System.out.println(cars[-0]);*/
		       
	}
}