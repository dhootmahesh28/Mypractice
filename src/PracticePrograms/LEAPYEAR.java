package PracticePrograms;
public class LEAPYEAR {
	public static void main (String[]args) {
		int year=2000;
		boolean Leap = false;
		if(year % 4 == 0)
		{
			if(year % 100 == 0)
			{
				if(year % 400 == 0)
				    Leap = true;
				else
					Leap = false;
			}
			else Leap = true;
		}
		else 
		  {
			Leap = false;
	      }

		if(Leap==true)
		{
			System.out.print("Its a Leap Year");
		}
		else
		{
			System.out.print("Its not a Leap Year");
		}
}
	
}
