public class Recursion2 {

    public static int printNumber(int n){
        if (n <= 0) {
            return 0;
        }
        System.out.println(n);
        int res = printNumber(n-1);

        return res;
    }

    // 5 * 4 * 3 * 2 * 1 = 120


    public static int factorial(int n){
        if (n <= 0) return 1;
        return n * factorial(n-1);
    }
    

    public static int fibonacci(int n){
        if (n == 0) {
            return 0;
        }else if (n == 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n - 2);
    }


    public static void main(String[] args) {
        
        int n = 10;

        int result = printNumber(n);


        System.out.println("Factorial is "+factorial(5));


        System.out.println("Fibonacci = "+ fibonacci(n));
    }

}
