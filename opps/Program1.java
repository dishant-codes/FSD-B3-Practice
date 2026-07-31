package opps;
class Car{

    private String color;
    private String brand;

    public void setColor(String color){
        this.color = color;
    }

    public void getColor(){
        System.out.println("Color is "+this.color);
    }

}



public class Program1{
    public static void main(String[] args) {
        
        Car c1 = new Car();
        Car c2 = new Car();

        c1.setColor("Black");
        c1.getColor();

        c2.getColor();
        // c1.color = "Red";  
    }
}