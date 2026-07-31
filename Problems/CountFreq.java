public class CountFreq {
    
    public static void main(String[] args) {
        
        int[] arr = {3,5,3,8,1,9};
        int num = 3;


        int freq = 0;
        for(int i = 0; i < arr.length; i++){
            if (num == arr[i]) {
                freq++;
            }
        }


        System.out.println("Frequency of 3 is "+freq);


    }

}
