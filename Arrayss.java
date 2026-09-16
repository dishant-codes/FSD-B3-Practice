import java.util.*;

public class Arrayss {

    static Scanner scan = new Scanner(System.in);

    public static void updateValue(int[] nums, int index){
        System.out.println("Enter Value :");
        int value = scan.nextInt();
        nums[index] = value;
        System.out.println("Value Updated");
    }

    static void main(String[] args) {

        int[] nums = {20,50,60,10,40};


        System.out.println("Array :");
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();


        updateValue(nums, 2);

        System.out.println("Updated Array :");
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();

    }
}
