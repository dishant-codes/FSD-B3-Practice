class ControlFlowStatement{

    public static void main(String[] args) {
        
        // Control Flow Statement
         
        // Conditional Statements 

        int num1 = 2;

        if (num1 > 10) {
            System.out.println("Number is Greater than 10");
        }
        else{
            System.out.println("Number is not greater than 10");
        }


        // if... elseif... else...

        int marks = 30;

        char grade = 'F';

        if (marks > 90 && marks <= 100) {
            grade = 'A';
        }
        else if(marks > 70 && marks <= 90){
            grade = 'B';
        }
        else if(marks > 35 && marks <= 70){
            grade = 'C';
        }
        else{
            System.out.println("Failed");
        }
        System.out.println("Student Grade is "+grade);


        // Switch Case Statements 

        int day = 2;
        
        switch(day){
            case 1: System.out.println("Sunday"); break;

            case 2: System.out.println("Monday"); break;

            case 3: System.out.println("Tuesday"); break;

            case 4: System.out.println("Wendesday"); break;

            case 5: System.out.println("Thursday"); break;

            case 6: System.out.println("Friday"); break;

            case 7: System.out.println("Saturday"); break;
        }



    }

}