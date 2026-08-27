import java.util.Scanner;

public class Array2D {
    

    public static void main(String[] args) {
        
        //  3D Array = [layer][row][columns]
        // int[][][] arr = new int[2][4][3];
        int[][] arr = new int[4][3];
        Scanner scan = new Scanner(System.in);


        System.out.println("This is 2D Array");
        
        for(int i =0; i< arr.length; i++){
            for(int j =0; j < arr[i].length; j++){
                System.out.println("Enter Value for Row "+i+" and Column "+j);
                arr[i][j] = scan.nextInt();
            }
        }


         for(int i =0; i< arr.length; i++){
            for(int j =0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+ "  ");
            }
            System.out.println("");
        }


    }
}
