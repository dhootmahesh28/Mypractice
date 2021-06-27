package PracticePrograms;
public class NegativetoPositive {

	public static void main(String[] args) {
		
		//If Number is negative make it positive and if number is Odd make it even
		
		/*int [][] a = {{1,2,3,4},{-1,-3,-4,-5},{-9,1,-5,6},{-4,3,8,7}};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j] < 0 ) 
				{
					a[i][j] = a[i][j] * (-1);
				}	
				
				if(a[i][j]%2 == 1)
				{
					a[i][j] = a[i][j] + 1;	
				}
				
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		} */

		
		//Decimal points of float make it as '00' 
		
		float [][] b = {{3.14f,5.32f,6.89f,3.54f}};
		int[] c = new int[b.length];
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[0].length;j++)
			{ 
				c [i] = (int) b[i][j];
				System.out.print(b[i][j]+ " ");
				b[i][j] = (float) c[i];
				
				System.out.printf("%.2f ", b[i][j]);
				
			}
			    System.out.println();
		}
	}

}
