class Gadgets{
    private String name;
    private Double price;

    public Gadgets(){
        this.name = "unnamed";
    }
    public Gadgets(String name){
        this.name = name;
    }

    public Gadgets(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public Double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public void startGadgets(){
        System.out.println("Starting Gadget...");
    }
}

class Computer extends Gadgets{
    private String gen;
    private double storage;


    public Computer(String gen, double storage, String name, double price){
        super(name, price);
        this.gen = gen;
        this.storage = storage;
    }

    public void display(){
        System.out.println("Name       : "+getName());
        System.out.println("Price      : "+getPrice());
        System.out.println("Generation : "+gen);
        System.out.println("Storage    : "+storage);
    }


    @Override
    public void startGadgets(){
        System.out.println("Starting Computer...");
    }

}



public class ClassAndObject{

   public static void main(String[] args) {
    
        // Gadgets gadget = new Gadgets();
        Computer gadget = new Computer("7th Gen", 512.00, "ASUS VIVOBOOK 16x", 65000.00);

        gadget.display();
        gadget.startGadgets();


        Video v1 = new Video();
        v1.stop();

        Audio a1 = new Audio();
        a1.play();



        

   }

}