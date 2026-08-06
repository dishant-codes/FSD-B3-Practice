package opps;


// Compile-Time Polymorphism

class Calculator{

    public int add(int a, int b){
        return a+b;
    }

    public double add(int a, int b, int c){
        return a+b+c;
    }

    public int add(int a, int b, int c, int d){
        return a+b+c+d;
    }

}


public class Polymorphism {
    public static void main(String[] args) {
        
        Calculator calci = new Calculator();

        calci.add(20, 10);
        calci.add(20, 10, 30);

    }
}
