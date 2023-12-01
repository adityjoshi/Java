package Recursion.LeetCode;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
    char [] s = {'h','e','l','l','o'};
    int start = 0;
    int end = s.length-1;
    reverseString(s,start,end);
        System.out.print(Arrays.toString(s));
    }
    static void reverseString(char [] s , int start , int end) {
        if (start >= end) {
            return;
        }
        char temp = s[start];
        s[start]=s[end];
        s[end]=temp;
       reverseString(s,++start,--end);
    }
}
