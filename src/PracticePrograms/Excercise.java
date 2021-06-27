package PracticePrograms;//1. Reverse Each element of String Array if Length is even number
//2. In a String Array, Print element which has highest length
//3. Arr[1] + Arr[2] = Arr[3]
//4. Find count of negative number in each row of 2-D Int Array
//5. Nested Switch for Years & Month

public class Excercise {
    public static void main(String[] args) {

     //---------------------------------------------------------------------------------------------------------------
       /*
        //1. Reverse Each element of String Array if Length is even number
        String [][] a = {{"Mahesh", "Ranveer", "Salman", "khan"},
                        {"Dhoot", "Singh", "Salman khan", "Shahrukh"},
                        {"Shital", "Abc", "Efg", "Hijklm"},
                        {"Maruti 800", "Toyota", "Hyundai", "TATA"}};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j].length() % 2 == 0) {
                    StringBuffer b= new StringBuffer(a[i][j]);
                    System.out.print(b.reverse() + " ");
                }
            }
            System.out.println("");

        }   */
       //------------------------------------------------------------------------------------------------------------

          /*
        //2. In a String Array, Print element which has highest length

        String [] a = {"Mahesh Dhoot","Ranveer singh","Ajay Devgan","Rohit Shetty"};
        int min =0;
        String highest = "";
        for(int i=0; i< a.length; i++)
        {
            if(a[i].length() > min)
            {
                min = a[i].length();
                highest = a[i];
            }
        }
        System.out.println(highest);

        */
     //---------------------------------------------------------------------------------------------------------------
             /*
        //3. Arr[1] + Arr[2] = Arr[3]

        int [] a ={1,2,3,5};
        int [] b ={5,6,7,8};
        int [] c = new int [a.length];
        for(int i=0;i <a.length;i++)
        {
                c[i] = a[i] + b[i];
                System.out.println(c[i]);
        }

    //----------------------------------------------------------------------------------------------------------------
              */

        //4. Find count of negative number in each row of 2-D Int Array
         int[][] a = {{1,-2,-4,5},{-4,5,6,4},{1,2,5,4},{1,-2,-3,-4}};
         int count = 0;

         for(int i=0;i < a.length; i++)
         {
             for(int j=0; j< a[i].length;j++)
             {
                 if(a[i][j] < 0)
                 {
                     count++;
                 }
             }
             System.out.println("The count of Negative number in Row " + i + " is "+ count);
             count =0;

         }

    }
}