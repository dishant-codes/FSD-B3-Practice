package opps;

// Run-Time Polymorphism 

class Animal{
    public void sound(){
        System.out.println("Animal Makes Sound");
    }
}


class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog Barks");
    }
}


class Cat extends Animal{

    @Override
    public void sound(){
        System.out.println("Cat Meows");
    }
}

public class Polymorphism2 {

    public static void main(String[] args) {
        

            Dog cat1 = new Dog();
            cat1.sound();
   

    }
    
}
