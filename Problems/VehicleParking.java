abstract class Vehicle {
    private int vehicleNumber;
    private String ownerName;

    Vehicle(int vehicleNumber, String ownerName){
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    abstract void calculateParkingFee();
    
}

class Bike extends Vehicle{

    Bike(int vehicleNumber, String onwerName){
        super(vehicleNumber, onwerName);
    }

    void calculateParkingFee(){
        System.out.println("Parking Fee for Bike is 20Rs.");
    }
}


class Car extends Vehicle{

    Car(int vehicleNumber, String onwerName){
        super(vehicleNumber, onwerName);
    }

    void calculateParkingFee(){
        System.out.println("Parking Fee for Car is 50Rs.");
    }
}


class Truck extends Vehicle{

    Truck(int vehicleNumber, String onwerName){
        super(vehicleNumber, onwerName);
    }

    void calculateParkingFee(){
        System.out.println("Parking Fee for Truck is 100Rs.");
    }
}




public class VehicleParking {

    public static void main(String[] args) {
        

        Vehicle vehicle1 = new Bike(1, "Anand");
        vehicle1.calculateParkingFee();


        Vehicle vehicle2 = new Car(2, "Amit");
        vehicle2.calculateParkingFee();


        Vehicle vehicle3 = new Truck(2, "Amol");
        vehicle3.calculateParkingFee();

    }
    
    
}
