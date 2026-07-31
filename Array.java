public class Array {
    public static void main(String[] args) {
        
        int[][] matrix = {{2,4}, 
                         {5,6}};


        for(int i = 0; i< matrix.length; i++){

            for(int j = 0; j < matrix[i].length; j++){

                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();

        }

    }
}
