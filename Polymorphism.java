

class ArithmeticOP{
    
    public int addition(int a, int b){
        return a+b;
    }

    public int addition(int a, int b, int c){
        return a+b+c;
    }


    public int subtraction(int a, int b){
        return a-b;
    }


}



public class Polymorphism {

    public static void main(String[] args) {
        
        ArithmeticOP op = new ArithmeticOP();

        
        System.out.println("Addition is :"+op.addition(10, 20));
        System.out.println("Addition is :"+op.addition(10, 20, 50));


    }
    

}
