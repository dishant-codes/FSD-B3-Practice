import java.util.Arrays;

class Smallest{

    public static void reverse(int[] arr, int n){
        for(int i = n-1; i >= 0; i--){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        
    

        int[] arr = {1,2,4,7,6,5};

        int size = arr.length;

        reverse(arr, size);
        
        // int secondLargest = 0;
        // int secondSmallest = 0;

        // if (arr.length == 0 || arr.length == 1) {
        //         secondLargest = -1;
        //         secondSmallest = -1;
        // }


        // Arrays.sort(arr);
        // secondLargest = arr[1];
        // secondSmallest = arr[arr.length - 2];  

       
        // System.out.println("Second Largest element in array is "+secondLargest);
        // System.out.println("Second Smallest element in array is "+secondSmallest);

    }

}