public class Sorting2 {

    public static void bubbleSort(int[] arr){

        int n = arr.length;
        int numSwap = 0;

        for (int i = 0; i < n-1 ; i++){

            for (int j = 0; j < n-1-i; j++){

                if (arr[j] > arr[j+1]){
                    // arr[j] = a
                    // arr[j+1] = b
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    numSwap++;
                }

            }

        }

        System.out.println("Number Of Swaps :"+numSwap);
        System.out.println("First Element :"+arr[0]);
        System.out.println("Last Element :"+arr[n-1]);


    }


    public static void mergeSort(int[] arr, int left, int right){

        if (left < right){

            int mid = left + (right - left) / 2;


            mergeSort(arr,left, mid);

            mergeSort(arr, mid+1, right);

            merge(arr, left, mid, right);

        }

    }

    public static void merge(int[] arr, int left, int mid, int right){

        int n1 = mid - left + 1;
        int n2 =  right - mid;


        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];


        for (int i = 0; i < n1; i++){
            leftArr[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++){
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while(i < n1 && j < n2){
            //  2, 3, 6
            //  4, 5, 7

            //  2, 3, 4, 5, 6

            if (leftArr[i] <= rightArr[j]){
                arr[k++] = leftArr[i++];
            }
            else{
                arr[k++] = rightArr[j++];
            }
        }

        while(i < n1){
            arr[k++] = leftArr[i++];
        }

        while(j < n2){
            arr[k++] = rightArr[j++];
        }

    }

    static void main(String[] args) {

        int[] arr = {3, 1, 4, 2, 6, 5};

        mergeSort(arr, 0, arr.length-1);

        for (int item: arr){
            System.out.print(" "+item);
        }


    }

}
