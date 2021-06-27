package PracticePrograms;

//To get top-down/down-top Triangular pattern
public class STARPATTERN {
    public static void main(String[] args) {
        int i,j,rows=9;
        //for(i=1;i<=rows;i++) //Down to Up
          for(i=rows;i>=1;i--) //Up to Down
        {
          for(j=1;j<i;j++)
          {
              System.out.print(" ");
          }
          for(j=i;j<=rows;j++)
          {
              System.out.print(j+" "); //System.out.print("* ");
          }
              System.out.println();
        }
    }
}
