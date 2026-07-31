public class Flag {
    public static void main(String[] args) {
        
        int n = 4;
        int pipe = 7;

        

        for(int i = 0; i < n; i++){ 
            for(int j = 0; j < i; j++){
                    System.out.print(" * ");
            }

            System.out.println("");
        }

        for(int i = 0; i < n; i++){ 
            for(int j = 0; j < n - i; j++){
                 System.out.print(" * ");
            }
            System.out.println("");
        }

        for(int i = 0; i < pipe; i++){
            System.out.println(" * ");
        } 

    }
}
