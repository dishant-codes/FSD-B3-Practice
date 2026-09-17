public class Searching {
    
    public static int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;
    }



    public static int binarySearch(int[] arr, int target){

        int first = 0;
        int last = arr.length-1;

        while (first <= last) {
            
            int mid = (first + last)/ 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                first = mid+1;
            }
            else{
                last = mid-1;
            }
        }
        return -1;
    }


    public static boolean linearSearch2D(int[][] arr, int target){


        for(int i=0; i < arr.length;i++){

            for(int j=0; j < arr[i].length; j++){

                if (arr[i][j] == target) {
                    return true;
                }

            }
        }

        return false;
    }
    public static void main(String[] args) {
        
        // int[] arr = {5,10,20,60,78,90};

        // int result = binarySearch(arr, 60);


        // if (result != -1) {
        //     System.out.println("Element Found At Index :"+result);
        // }
        // else{
        //     System.out.println("Element Not Found");
        // }




        int[][] arr = {
            {3,4,5},
            {6,7,9},
            {10,11,12}
        };


        int target = 7;


        if (linearSearch2D(arr, target)) {
            System.out.println("Element Found in given array");
        }
        else{
            System.out.println("Element Not Found");
        }


    }
}
