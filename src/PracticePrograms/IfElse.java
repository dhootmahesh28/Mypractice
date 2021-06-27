package PracticePrograms;

public class IfElse {

	public static void main(String[] args) {

     int salary=10000, hike=0;
     
     if (salary <= 10000)
     {
    	hike = (salary * 20)/100;
    	salary = salary + hike;
    	System.out.println("The new salary is " + salary + ". The hike is 20%" );
    	
     }
     else 
     {
    	if (salary > 10000 && salary <= 30000)
    	{
    		hike = (salary * 15)/100;
    		salary = salary + hike;
        	System.out.println("The new salary is " + salary +  " The hike is 15%" );
    	}
    	
    	else
    	{
        	if(salary > 30000 && salary <=70000 )
        	{
        		hike = (salary * 5)/100;
        		salary = salary + hike;
            	System.out.println("The new salary is " + salary + " The hike is 5%" );
        	}
    	
    	    else
    	   {
    		System.out.println("No hike");
    	  }
    	}
    	
     }   

  }

}
