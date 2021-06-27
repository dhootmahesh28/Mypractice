package PracticePrograms;

//Declare 2-D Array of length 4 x 10 and write letters of flower in each row
public class Array2D {
    public static void main(String[] args) {

        /*char[][] mycolor = {{'S','U','N','F','L','O','W','E','R',' '},
                           {'B','L','U','E','B','E','L','L',' ',' '},
                           {'T','U','L','I','P',' ',' ',' ',' ',' '},
                           {'R','O','S','E',' ',' ',' ',' ',' ',' '}};

               for(int i=0; i<mycolor.length;i++)
        {
            for(int j=0; j< mycolor[0].length; j++)
            {
                System.out.print(mycolor[i][j] + " ");
            }
            System.out.println("");
        } */
     //---------------------------------------------------------------------------------------------------------------
     /*
       int[][] mynumber = {{1,2,3,4},{5,6,7,8},{7,8,9,10}};
        for(int i=0; i < mynumber.length;i++)
        {
            for (int j = 0; j < mynumber[i].length; j++)
            {
                System.out.print(mynumber[i][j] + " ");
            }
            System.out.println("");

        }*/
     //---------------------------------------------------------------------------------------------------------------
      //Printing 2-D Int Array using While Loop

      int [][] a = {{1,2,3,4},{4,5,6,7},{5,7,8,9},{7,6,9,8}};
      int i=0,j=0;

      while(i < a.length)

        {
            while(j < a[i].length)
            {
               // if (i%2 == 0)  Print Alternate Rows (Even/Odd )
                //{
                System.out.print(a[i][j] + " ");
                //}
                j++;
            }
               j=0;
               i++;

            System.out.println();

        }

    }
}
