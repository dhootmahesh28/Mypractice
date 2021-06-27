package PracticePrograms;

public class Fibbonacci {

	public static void main(String[] args) {
		int a=0,b=1,c=1;
		System.out.print(a+" "+b);
		for(int i=2;i<10;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}

	}

}
