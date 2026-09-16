public class Arrays2D {

    static void main(String[] args) {

//        int[][] student_marks = {
//                {23,45,54,43},
//                {10,34,53,23},
//                {10,23,53,24}
//        };
//
//
//        for (int i = 0; i < student_marks.length; i++){
//
//            System.out.println("******* Student "+(i+1)+" *******");
//
//            for (int j = 0; j < student_marks[i].length;j++){
//                System.out.println("Subject "+(j+1)+" = "+student_marks[i][j]);
//            }
//
//            System.out.println("**************************");
//
//        }



        int[][] matrix = {
                {23,45,54,43}, // 0,0 -> 0,1 -> 0,2 -> 0,3
                {10,34,53,23},
                {10,23,57,24},
                {32,13,56,32}
        };

        int target = 5;
        boolean isFound = false;

        for (int rows = 0; rows < matrix.length; rows++){
            for (int cols = 0; cols < matrix[rows].length; cols++){

                if (matrix[rows][cols] == target){
                    isFound = true;
                    break;
                }
            }
        }

        if (isFound){
            System.out.println("Element Found");
        }else {
            System.out.println("Not Found");
        }



    }
}
