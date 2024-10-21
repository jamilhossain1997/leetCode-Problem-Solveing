import java.util.Arrays;

public class ReversNumber {
    public int reve(int x) {
        int reves=0;
        while (x!=0) {
            int digit=x%10;

            if (reves > Integer.MAX_VALUE / 10 || (reves == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;  
            }
            if (reves < Integer.MIN_VALUE / 10 || (reves == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;  
            }

            reves=(reves*10)+ digit;
            x=x/10;

        }

        return reves; 
    }


    public static void main(String[] args) {
        ReversNumber ReversNumber = new ReversNumber();
        int nums =-1231234567;
        int result = ReversNumber.reve(nums);
        System.out.println((result)); 
    }
}
