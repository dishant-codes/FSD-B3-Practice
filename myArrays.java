public class MyArrays {

    static void main(String[] args) {


//        int[] nums = {20,30,40,50};
//        System.out.println(nums.length);


        int[] nums = new int[4];

        nums[0] = 5;
        nums[1] = 3;
        nums[2] = 4;
        nums[3] = 8;

//        [0, 0, 0, 0]

        // Searching Value in Array
        int key = 4;
        for (int i = 0; i< nums.length; i++){
            if (nums[i] == key){
                System.out.println("Index "+i);
            }
        }


        // Sum of all element present in array
        int sum=0;
        for (int i = 0; i< nums.length; i++){
            sum += nums[i];
        }
        System.out.println("Sum of all array elements is "+sum);


//        System.out.println("Index 0 "+ (nums[0] == key));
//        System.out.println("Index 1 "+ (nums[1] == key));
//        System.out.println("Index 2 "+ (nums[2] == key));
//        System.out.println("Index 3 "+ (nums[3] == key));




        // Create Result Calculator (required: subject marks, percentage, total marks, grade)



    }

}
