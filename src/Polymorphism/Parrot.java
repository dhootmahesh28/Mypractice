package Polymorphism;

public class Parrot {

    public void talk(int number){
        System.out.println("Talking number....."+ number);
    }

    public void talk(String sentence){
        System.out.println("Talking sentence....."+ sentence);
    }


    public void walk(int number){
        System.out.println("walking parrot....."+ number);
    }
    public static void main(String[] args) {
        Parrot p = new Parrot();
        Bird b = new Bird();
        b.walk();
        p.talk(8);
        p.talk("mahesh");
        p.walk(5);

    }
}
