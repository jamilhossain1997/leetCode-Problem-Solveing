import java.util.*;

public class RunningSum {
    public int[] sum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        return nums;
    }


    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", "); 
            }
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        RunningSum RunningSum = new RunningSum();
        int[] nums = { 1, 2, 3, 4 };
        int[] result = RunningSum.sum(nums);
        System.out.println(Arrays.toString(result)); 
    }

}
