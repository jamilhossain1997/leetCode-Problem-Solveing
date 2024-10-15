package Array;

public class plusOne {

    public int[] onePlus(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; 
                return digits; 
            }
            digits[i] = 0; 
        }
        int[] result = new int[n + 1];
        result[0] = 1; 
        return result; 
    }

    public static void main(String[] args) {
        plusOne plusOne = new plusOne();
        int[] nums1 = {1, 2, 3};
        int[] newNums1 = plusOne.onePlus(nums1); 

        System.out.print("Updated array for [1, 2, 3]: ");
        for (int num : newNums1) { 
            System.out.print(num + " ");
        }
        System.out.println();

        int[] nums2 = {4, 3, 2, 1};
        int[] newNums2 = plusOne.onePlus(nums2); 

        System.out.print("Updated array for [4, 3, 2, 1]: ");
        for (int num : newNums2) { 
            System.out.print(num + " ");
        }
        System.out.println();

        int[] nums3 = {9}; 
        int[] newNums3 = plusOne.onePlus(nums3);

        System.out.print("Updated array for [9]: ");
        for (int num : newNums3) { 
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
