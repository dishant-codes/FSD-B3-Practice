public class StringEx {
    
    public static void main(String[] args) {
        
        String[][] names = new String[3][3];


        names[0][0] = "Dishant";
        names[0][1] = "Anand";
        names[0][2] = "Akshay";

        names[1][0] = "Ranveer";
        names[1][1] = "Ranjeet";
        names[1][2] = "Shreyash";

        names[2][0] = "Jayesh";
        names[2][1] = "Yuvraj";
        names[2][2] = "Mahendra";


        for(int i = 0; i < names.length; i++){

            for(int j = 0; j < names[i].length; j++){
                System.out.print(names[i][j]+ " ");
            }

            System.out.println("");
            
        }


        
        names[1][2] = "Gopal";
        
        System.out.println(names[1][2]);



    }
}
