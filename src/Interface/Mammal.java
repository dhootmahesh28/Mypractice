package Interface;

public  class Mammal implements Animal,Birds {
    @Override
    public void dog(){
        System.out.println("Its a dog");
    }
    @Override
    public void elephant(){
        System.out.println("Its an elephant");
    }
    @Override
    public  void tiger(){
        System.out.println("its a tiger");
    }
    @Override
    public  void peacock(){
        System.out.println("Its a peacock");
    }
    @Override
    public void parrot(){
        System.out.println("Its a Parrot");
    }
    public  void dove(){
        System.out.println("its a dove");
    }

    public static void main(String[] args) {
        Mammal m = new Mammal();
        m.dog();
        m.parrot();
    }


}
