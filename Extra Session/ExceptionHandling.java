public class ExceptionHandling {
    public static void main(String[] args) {
        
        int rasgullas = 1;

        try{

             System.out.println("Serving hot rasgullas to ranbeer kapoor");

            if (rasgullas == 0) {
                throw new RuntimeException("Rasgulla Counter is ZERO");
            }

             System.out.println("Ranbeer Kapoor is Happy");

        }
        catch(ArithmeticException e){
            System.out.println("Quick Throw Gulab Jamuns to Ranbeer kapoor");
            System.out.println("Reason for Panic is :"+e.getMessage());
        }
       

    }
}
