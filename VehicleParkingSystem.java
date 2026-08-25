// Practical 10: Vehicle Parking System (Abstract Class)
// Create abstract class Vehicle with private vehicleNumber and ownerName.
// Implement calculateParkingFee() in Bike, Car and Truck subclasses.


abstract class Vehicle{
    private String vehicleNumber;
    private String ownerName;

    public Vehicle(String vehicleNumber, String ownerName){
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }
    
    // Overloaded Constructor
    public Vehicle(String vehicleNumber){
        this.vehicleNumber = vehicleNumber;
    }

    abstract void calculateParkingFee();
}


class Bike extends Vehicle{

    public Bike(String number, String name){
        super(number, name);
    }

    @Override
    void calculateParkingFee(){
        System.out.println("Parking Fee for Bike is : 20Rs.");
    }
}

class Car extends Vehicle{


    public Car(){
        super("MH20GG9717","Dishant");
    }

    public Car(String vehicleNumber){
        super(vehicleNumber);
    }

    @Override
    void calculateParkingFee(){
        System.out.println("Car Parking Fee : 50Rs");
    }

}


class VehicleParkingSystem{
    public static void main(String[] args) {

        Vehicle car = new Car();
        car.calculateParkingFee();


        Vehicle rr = new Car("MH20GG7777");

        car.calculateParkingFee();
    }
}