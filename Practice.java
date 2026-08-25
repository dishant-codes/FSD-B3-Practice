public class Practice {
    static int first = 0;
    static int second = 1;




    public static void Fibonacci(int n){
        

        if (first == 0) {
            System.out.print(first+" ");
        }

        if (second == 1) {
            System.out.print(second+" ");
        }

        // for(int i =0; i < n; i++){
        //     int next = first + second;
        //     System.out.print(next+" ");

        //     first = second;
        //     second = next;
        // }


       // Fibonacci using recursion
        if(n > 2){
            int next = first + second;
            System.out.print(next+" ");
            first = second;
            second = next;
            Fibonacci(n-1);
        }

    }


    public static void displayName(String name, int n){
        for(int i = 0; i < n; i++){
            System.out.println(name);
        }
    }


    public static void main(String[] args) {
        
        Fibonacci(9);


        displayName("Dishant", 6);
        displayName("Aarak", 5);
        displayName("upGrad", 5);
       
    }
    
}