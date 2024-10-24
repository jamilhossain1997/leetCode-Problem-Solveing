public class MajorityElement {
    


    public static int MajorityElement(int[] nums){
        int count=0;
        int cande=0;

        for(int i=0; i< nums.length; i++){
           if(count==0){
               cande=nums[i];
           }

           if(cande == nums[i]){
               count++;
           }else{
               count --;
           }
        }

        return cande;
   }
}
