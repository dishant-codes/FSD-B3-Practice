import java.util.Arrays;

public class MakeBouquet {
    
    public static int minDays(int[] bloomDay, int m, int k){

        int n = bloomDay.length;

        // 5 flowers
        // m = 3 (bouquets)
        // k = 2 (flowers)

        // m * k = 6 flowers
        
        if (m*k > n) {
            return -1;
        }

        int left = 1; // minimum days

        int right = Arrays.stream(bloomDay).max().getAsInt(); // maximum days

        while (left<right) {
            int mid = left + (right - left) / 2;
            // 1 + (10-1) / 2
            // 5
            if(canMakeBouquet(bloomDay, m, k, mid)){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }

        return left;
    }


    public static boolean canMakeBouquet(int[] bloomDay, int m, int k, int days){

        int count = 0;
        int flowers = 0;

        for(int i = 0; i < bloomDay.length; i++){

            if (bloomDay[i] <= days) {
                flowers++;

                if (flowers == k) {
                    count++;
                    flowers = 0;
                }
            }
            else{
                flowers = 0;
            }
        }

        return count >= m;

    }




    public static void main(String[] args) {
        

        int[] bloomDay = {1,10,3,10,2};
        int m = 3;
        int k = 1;


        System.out.println(minDays(bloomDay, m, k));


    }

}



//  Time : O(log n)

//  Binary Search Operates [1, max(BloomDay)]


// log(max(bloomDay))


// checks : O(n)



// total work = O(log(max(bloomDay))) * O(n)

//  = O(n log(max(bloomDay)))


// n = 10000,  max(BloomDay) = 1000000


// log^2 1000000 ~ 20

// total work = 10000 * 20
//            = 200000