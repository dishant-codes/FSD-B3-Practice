public class Expressions {
    public static void main(String[] args) {
        

        // Arithmetic Expressions

        int num1 = 30;
        int num2 = 20;

        int result = num1 + num2;
        System.out.println("Addition is :"+result);

        result = num1 - num2;
        System.out.println("Subtraction is "+result);

        result = num1 * num2;
        System.out.println("Multiplication is "+result);

        result = num1 / num2;
        System.out.println("Division is "+result);

        result = num1 % num2;
        System.out.println("Modulus is "+result);



        // Relational Expression 

        int a = 10;
        int b = 5;

        System.out.println("Equal To "+(a == b)); // false
        System.out.println("Greater than "+(a > b)); // true  (>=)
        System.out.println("Less than "+(b < a)); // true    (<=)
        System.out.println("Not Equal to "+(a != b));  // true 

        String name = "Dishant";
        System.out.println("String Comparision is "+(name.equals("upGrad")));


        // Logical Expressions

        int x = 5;
        int y = 8;
        int z = 10;

        // Logical AND  =  &&
            //    true = 1, false = 0
            //    1 * 0  = 0
            //    1 * 1  = 1
            //    0 * 0  = 0 
        boolean logical_and = x > y && x < z;
        System.out.println(logical_and);


        // Logical OR  =  ||
            //   true = 1, false = 0
            //   1 + 0 = 1
            //   1 + 1 = 1
            //   0 + 0 = 0 
        boolean logical_or = x > y || x < z;
        System.out.println(logical_or);


        // Logical NOT  =  !
        boolean logical_not = !(x > y);
        System.out.println(logical_not);


        // Assignment Expressions
        a = 12;
        b = 15;

        a += b; // a = a + b
        System.out.println(a);

        a -= b; // 12
        System.out.println(a);

        a *= b; // 180
        System.out.println(a);

        a /= b;  // 12
        System.out.println(a);

        a %= b; // 12
        System.out.println(a);
    }
}

