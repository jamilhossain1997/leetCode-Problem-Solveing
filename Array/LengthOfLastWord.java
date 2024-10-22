public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();

       int lastSpaceIndex = s.lastIndexOf(' ');

        return s.length()-lastSpaceIndex-1;
    }


    public static void main(String[] args) {
        LengthOfLastWord LengthOfLastWord = new LengthOfLastWord();
        int nums =-1231234567;
        int result = LengthOfLastWord.lengthOfLastWord(nums);
        System.out.println((result)); 
    }
}
