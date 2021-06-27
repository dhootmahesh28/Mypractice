package PracticePrograms;

//To get Diamond * pattern
public class DIAMOND {
    public static void main(String[] args) {
        int i,j,rows=9;
        for(i=rows;i>=1;i--) //Up to Down
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
        for(i=2;i<=rows;i++) //Down to Up
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

