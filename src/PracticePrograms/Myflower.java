package PracticePrograms;//Creating a Class, Object and calling Methods () from Main method

public class Myflower {

    String name ="",color="";

    //Method templedecoration
    void templedecoration()
    {
        System.out.println("1");
    }

    //Method add
    int add (int a,int b)
    {
        int k = a+b;
        return k;
    }

    //Method substract
    int substract (int a,int b)
    {
        int k = a-b;

        if(k < 0)
        {
            return 0;
        }
        return k;
    }

    //Method vehicledecoration
    void vehicledecoration()
    {
        System.out.println("3");

    }

    //Main Method
    public static void main(String[] args) {
        Myflower rose =new Myflower();
        rose.templedecoration();
        rose.vehicledecoration();
        int j =rose.add(5, 3);
        System.out.println(j);
        int i =rose.substract(9,8);
        System.out.println(i);
    }
}

