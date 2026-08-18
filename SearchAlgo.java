public class SearchAlgo {
    

    public static void linearSearch(int[] arr, int key){

        // {10, 20, 5, 6, 50}

        int n = arr.length;

        for(int i = 0; i < n; i++){
                if (arr[i] == key) {
                    System.out.println("Element Found at "+i);
                    return;
                }
        }
    }


    public static void binarySearch(int[] arr, int key){

        int n = arr.length;
        

        int first = 0;
        int last = n-1;

        int found = -1;

        while (first <= last) {
            int mid = (first + last) / 2;
            
            if (arr[mid] == key) {
                found = mid;
                break;
            }

            if (arr[mid] > key) {
                last = mid-1;
            }

            if (arr[mid] < key) {
                first = mid + 1;
            }
            
        }
        if (found != -1) {
            System.out.println("Element Found at "+found);
        }
        else{
            System.out.println("Element Not Found");
        }


    }


    public static void main(String[] args) {
        
        int[] arr = {10, 20, 5, 6, 50};

        // linearSearch(arr, 6);
        binarySearch(arr, 6);


    }

}
