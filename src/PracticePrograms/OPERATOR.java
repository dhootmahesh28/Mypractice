package PracticePrograms;

// JAVA Operator
public class OPERATOR {
    public static void main(String[] args) {
        /* int a = 0, b = 0;
        if (a != b)
            {
            System.out.println("true");
            }
        else
            {
            System.out.println("false");
            }*/
         int a=10, b=20;
         a = ++a + b--;
         System.out.println(a);
         b = a++ + ++b;
         System.out.println(b);
    }
}