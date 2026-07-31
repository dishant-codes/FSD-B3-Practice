class LoopExamples{

    public static void main(String[] args) {
        
        int[] scores = {32,46,78,20,60};

        // System.out.println(scores[0]);
        // System.out.println(scores[1]);
        // System.out.println(scores[2]);
        // System.out.println(scores[3]);
        // System.out.println(scores[4]);

        // for(int i = 0; i < scores.length; i++){
        //     System.out.println(scores[i]);
        // }


        // *
        // * *
        // * * *
        // * * * *
        // int n = 4;

        // for(int i = 1; i <= n; i++){

        //     for(int j = 1; j <= n-i+1;j++){
        //         System.out.print("  ");
        //     }

        //     for(int k = 1; k <= i; k++){
        //         System.out.print("* ");
        //     }

        //     System.out.println("");
        // }



        //      *
        //    * *
        //  * * *
        //* * * *


        // int n = 4;

        // for(int i = 1; i <= n; i++){
        //    for (int j = 1; j <= n-i + 1; j++){
        //      System.out.print("  ");
        //    }

        //    for(int k = 1; k <= i; k++)
        //    {
        //         System.out.print("* ");
        //    }
        //    System.out.println("");
        // }



        // for(int i = 1; i <= n; i++){

        //     for(int j = 1; j <= n; j++)
        //     {  
        //         if (i == 1 || i == n || j == 1 || j == n) {
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }

        //     System.out.println("");
        // }


        int n = 7;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {

                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                }
                else if ((i >= 3 && i <= 5) && (j >= 3 && j <= 5)
                        && (i == 3 || i == 5 || j == 3 || j == 5)) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }

            System.out.println("");
        }
      

        

        

    }

}