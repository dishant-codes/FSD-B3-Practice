public class ArrayEx {


    

    public static double find_average(int[] arr){

        double avg = 0;
        int total = 0;

        // for(int i = 0; i<arr.length; i++){
        //     total += arr[i];
        // }

        for(int val:arr){
            total += val;
        }

        avg = total/arr.length;

        return avg;
    }


    public static void main(String[] args) {
        
        int[] marks = {23,34,12,76,87,12};

        // int sum = 0;

        // for(int i = 0; i < marks.length; i++){
        //     sum += marks[i]; // sum = sum + marks[i]
        //     sum = sum + marks[i];
        // }

        // System.out.println("Sum of All Marks is "+sum);



        System.out.println("Average is "+find_average(marks));
        
    }
}
