//Constructor
//Two types of Constructor
//1.Default Constructor
//2.Parameterized Constructor

//Rules for creating a constructor.

//  1. Constructor name must be the same as its class name
//  2. A Constructor must have no explicit return type (No Void() as well)
//  3. A Java constructor cannot be abstract, static, final, and synchronized
package Constructor;
public class Constructor {
   // /*
    public Constructor ()  //Default Constrcutor
    {
        this("pune");  //Calling 1 argument Constructor
        System.out.println("Default constructor");
    }

        public Constructor (String str)   //1 argument Constructor
    {
                System.out.println("1 argument Constructor " + str);
    }

    public static void main(String[] args)
    {
        //Constructor c = new Constructor();
        Constructor c = new Constructor("My name is Mahesh");
    }
}
 //*/
 //------------------------------------------------------------------------------------------------------------

    /*
    //Parameterized Constructor
    int gear;
    int speed;
    public Constructor(int gearnew, int speednew) {
        gear = gearnew;
        speed = speednew;
        System.out.println(gear);
        System.out.println(speed);
    }

    public static void main(String[] args) {
        Constructor c = new Constructor(5, 10);
    }
}

*/
//--------------------------------------------------------------------------------------------------------------------
