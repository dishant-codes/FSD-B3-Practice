import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {
    
    public static void checkAge(int age) throws ArithmeticException{

        if (age < 18) {
            throw new ArithmeticException("Not Eligible");
        }
        System.out.println("Eligible");
    }

    public static void main(String[] args) {
        

        // try{
        //     int num = 10;
        //     int result = num / 0;
        //     System.out.println(result);
        // }
        // catch(ArithmeticException e){
        //     System.out.println("cannot divide by zero");
        // }
      


      // Checked Exception

       try{
          FileReader file = new FileReader("data.txt");
       }
       catch(FileNotFoundException e){
          System.out.println("file not found");
       }




       // unChecked Exception
       try{
            String str = null;
            System.out.println(str.length());
       }
       catch(NullPointerException e){
         System.out.println("String is Null");
       }
       finally{
          System.out.println("end of program");
       }



       checkAge(19);


      

    }

}
