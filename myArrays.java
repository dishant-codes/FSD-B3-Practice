import java.util.Scanner;

public class myArrays {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        

        int[] arr = new int[5]; // default value for all elements are 0

        arr[0] = 30;
        arr[1] = 40;
        arr[2] = 50;
        arr[3] = 60;
        arr[4] = 70;
        // arr[5] = 80;
        
        for(int item : arr){
            System.out.println(item);
        }


        // 2D Array 

        // 2 5 7 8
        // 5 1 0 9
        // 1 2 4 6
        // int[][] matrix = new int[3][4];
        int[][] matrix;

        int rows;
        int cols;

        System.out.println("Enter Number of Rows");
        rows = scan.nextInt();

        System.out.println("Enter number of Colomns");
        cols = scan.nextInt();

        matrix = new int[rows][cols];


        for(int i = 0; i < matrix.length; i++){
            
            for(int j = 0; j < matrix[i].length; j++){
                
                System.out.println("Enter Value for "+j+" in "+i+" = ");
                matrix[i][j] = scan.nextInt();

            }

        } 

        


        for(int i = 0; i < matrix.length; i++){
            
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }

            System.out.println("");
        } 


    }

}
