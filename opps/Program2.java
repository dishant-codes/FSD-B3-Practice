package opps;

abstract class Vehicle{
    abstract void start(); // abtract method for starting vehicle
}

class Cars extends Vehicle{
    @Override()
    void start(){
        System.out.println("Car start with Key");
    }
    
}



public class Program2 {
    
   public static void main(String[] args) {
    
    Vehicle car = new Cars();

    car.start();

   }

}
