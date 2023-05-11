public class temo {
    public static void main(String[] args) {
        int x  = 123;
        System.out.println(isPalindrome(x));
    }
    static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int k = s.length();

        for (int i=0; i<k/2; i++) {

            if (s.charAt(i) != s.charAt(k-i-1)) return false;
        }

        return true;
    }
}

