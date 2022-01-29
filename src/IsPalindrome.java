public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(164611));

    }
    static boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        if (x>0 && x<=9){
            return true;
        }
        int reversNum =0;
        int origNum = x;
        while (x != 0){
            int lastNum = x % 10;
            reversNum = reversNum * 10 + lastNum;
            x = x /10;
        }
            return reversNum == origNum;

    }
}
