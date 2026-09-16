
class Mobile{
    private String brand_name;
    private String model;
    private double price;
    private boolean isAvailable;

    public void setDetails(String name, String model, double price, boolean isAvailable){
        this.brand_name = name;
        this.model = model;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public void display(){
        System.out.println("********"+brand_name+"********");
        System.out.println("Model :"+model);
        System.out.println("Price :"+price);
        System.out.println("In Stock :"+isAvailable);
    }

    public boolean checkStock(){
        return isAvailable;
    }

}



public class MobileSystem {

    static void main(String[] args) {

        Mobile samsung = new Mobile();
        samsung.setDetails("Samsung","S27 Ultra",1.25, false);


        Mobile iphone = new Mobile();

        iphone.setDetails("Apple", "iPhone 18 Duo", 4.5,true);


        System.out.println("Samsung :");
        if (samsung.checkStock()){
            System.out.println("Available in Stock");
        } else {
            System.out.println("Coming Soon");
        }


        System.out.println("iPhone :");
        if (iphone.checkStock()){
            System.out.println("Available in Stock");
        } else {
            System.out.println("Coming Soon");
        }


        samsung.display();
        iphone.display();

    }
}
