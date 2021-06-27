package PracticePrograms;

//To get top-down/down-top pattern
public class PATTERN {
    public static void main(String[] args) {
        int i,j,rows=9;
        for (i=1;i<=rows;i++)
          {
             // for(j=1;j<=i;j++) //Top to down
              for(j=rows;j>=i;j--) //Down to top
              {
                  System.out.print(j);
              }
                  System.out.println();
          }
    }
}
