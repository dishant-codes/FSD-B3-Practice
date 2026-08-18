public class Recursion {

    // static MyArrayList list;

    // public static void printNumbers(int n){
    //     if (n < 0) {
    //         return;
    //     }
    //     System.out.println(list.get(n));
    //     printNumbers(n-1);
    // }


    public static int binarySearch(int[] arr, int key){
        return binarySearch(arr, key, 0, arr.length-1);
    }

    public static int binarySearch(int[] arr, int key, int left, int right){

        if (left <= right) {

            int mid = (left+right)/2;
            
            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                return binarySearch(arr, key, mid+1, right);
            }

            return binarySearch(arr, key, left, mid-1);
        }

        return -1;
    }

    public static void main(String[] args) {
        
        // list = new MyArrayList();

        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(50);
        // list.add(60);
        // list.add(70);

        // printNumbers(list.size()-1);
        

        int[] arr = {23, 30, 35, 43, 50, 65, 87};

        int key = 65;

        int found = binarySearch(arr, key);

        if (found != -1) {
            System.out.println("Element Found at index "+found);
        }
        else{
            System.out.println("Element is not found");
        }

        // binarySearch(arr, key);


    }

}
