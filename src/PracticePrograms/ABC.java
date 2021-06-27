// Pyramid
//add comment2221
package PracticePrograms;
public class ABC {
	public static void main (String[]args)
	{
		int i,j,rows=9;
		
		 for(i=rows;i>=1;i--)
			{
				for(j=1;j<i;j++)
				{
				System.out.print(" ");
				}
				
				for(j=i;j<=rows;j++)
				{
				System.out.print("* ");
				}
				
				System.out.println();
			} 

		for(i=2;i<=rows;i++)
		 	  
		 
		{
			for(j=1;j<i;j++)
			{
			System.out.print(" ");
			}
			
			for(j=i;j<=rows;j++)
			{
			System.out.print("* ");
			}
			
			System.out.println();
		} 
		
		
	}

}
