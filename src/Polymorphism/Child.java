package Polymorphism;

public class Child extends Parent{
    @Override
    public void wealth_creation(){
        System.out.println("wealth creation using       Marketing");
    }

    public static void main(String[] args) {
        System.out.println("Inside child");
        Child c = new Child();
        c.wealth_creation();
        Parent p = new Parent();
        p.wealth_creation();

    }
}
