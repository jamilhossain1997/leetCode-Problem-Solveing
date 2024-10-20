
public class GetConcatenationSolution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];        
            ans[i + n] = nums[i];    
        }

        return ans;
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
        GetConcatenationSolution GetConcatenationSolution = new GetConcatenationSolution();
        int[] nums = {1, 2, 1};
        int[] result = GetConcatenationSolution.getConcatenation(nums);
        GetConcatenationSolution.printArray(result);  
    }
}
