package PracticePrograms;

public class PALINDROME {

	public static void main(String[] args) {
		int num=11211, reversednum =0, originalnum = num, reminder;
		while (num!= 0)
		{
			reminder = num % 10;
			reversednum = reversednum * 10 + reminder;
			num /= 10;
			
			
		}

		if(originalnum == reversednum)
		{
			System.out.println(originalnum + " The number is Palindrome number");
		}
		else
		{
			System.out.println(originalnum + " The number is not Palindrome number");
		}
	}

}
