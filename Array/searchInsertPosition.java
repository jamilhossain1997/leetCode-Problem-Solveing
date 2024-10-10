package Array;

public class searchInsertPosition {

    
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; 
            } else if (nums[mid] < target) {
                left = mid + 1;  
            } else {
                right = mid - 1;  
            }
        }

        return left;  
    }

    public static void main(String[] args) {
       
        searchInsertPosition searcher = new searchInsertPosition();

        int[] nums = { 1, 3, 5, 6 };
        int target = 5;

        int insertPosition = searcher.searchInsert(nums, target);

        System.out.println("Insert position: " + insertPosition);
    }
}
