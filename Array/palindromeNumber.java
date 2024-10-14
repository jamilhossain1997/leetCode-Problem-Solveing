package Array;

public class palindromeNumber {

    public static boolean Nums(int n) {
        int reverse = 0;
        int temp = n;
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        return (reverse == n);

    }

    public static void main(String[] args) {
        // Sample Input
        int n = 122;
        if (Nums(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}