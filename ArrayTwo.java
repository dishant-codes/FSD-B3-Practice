public class ArrayTwo {
    
    public static void main(String[] args) {
        
        // int[] marks = new int[5];

        // marks[0] = 10;
        // marks[1] = 20;
        // marks[2] = 30;
        // marks[3] = 40;
        // marks[4] = 50;
                      
        int[] marks = {10,20,30,40,50,60,70};


        // System.out.println(marks[0]);  // x100
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);

        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
            // 10
            // 10
            // 10
        }


        int[][] matrix = new int[2][2];
        

        matrix[0][0] = 2;
        matrix[0][1] = 4;
        matrix[1][0] = 5;
        matrix[1][1] = 6;

        for(int i=0; i<matrix.length;i++){

            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println("");

        }

    }
}
