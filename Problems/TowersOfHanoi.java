public class TowersOfHanoi {
    
    public static void solve(int n, char source, char auxiliary, char target){

        if (n == 1) {
            System.out.println("Move disk 1 from "+source+" to "+ target);
            return;
        }


        solve(n-1, source, target, auxiliary); // 1, 2

        // move largest disk 
        System.out.println("Move disk "+n+" from "+source+" to "+target);
        

        solve(n-1, auxiliary, source, target);
    }


    



}
