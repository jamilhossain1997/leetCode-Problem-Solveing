package Array;

public class removeElement {

    public static int emoveElement(int[] nums, int val) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;

    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 }; 
        int val = 3; 

        int newLength = emoveElement(nums, val); 

        System.out.println("New length: " + newLength); 
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
