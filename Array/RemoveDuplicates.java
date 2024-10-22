public class RemoveDuplicates {
    public int removeDuplicates1(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int j = 2; 
        for (int i = 2; i < nums.length; i++) {
        
            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i]; 
                j++; 
            }
        }

        return j; 
    }

   
    public void printArray(int[] nums, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();  
    }

    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int newLength = removeDuplicates.removeDuplicates1(nums);
        removeDuplicates.printArray(nums, newLength);
    }
}
