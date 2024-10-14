package Array;



public class palindromeNumber {

    public static boolean  Nums(int n){
             int r=0;
              int t=n;

              while (t !=0) {
                 r=(t*10)+ (t%10);
                 t=t/10;

              }

              return (r==n);

    } 


    public static void main(String[] args)
    {
        // Sample Input
        int n = 122;
        if (Nums(n)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}