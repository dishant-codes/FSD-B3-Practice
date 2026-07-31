public class Example {

    public static void main(String[] args){

        int x = 5;

        int y = 10;

        int z = (x++ * y--) - (--x * ++y);

        System.out.println(z);

    }

}