package Recursion.LeetCode;

public class printNum {
    public static void main(String[] args) {
        int n = 10;
        num(1,n);
    }
    static void num(int start , int end) {
        if (start <= end) {
            System.out.print(start + " ");
            num(start+1,end);
        }
    }
}
