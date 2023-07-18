package Recursion.string;

import java.util.ArrayList;
import java.util.Collections;

public class subsetSubstring {
    public static void main(String[] args) {
        sub("" , "abc");
        System.out.println(subarr("" , "abc"));
        subAscii("" , "abc");
        /*
         subset => for permutations and combinations
 subset of abc => {a,b,c,ab,ac,bc,abc} we can't change the order like ca
  */
    }
    static void sub(String p , String up) {
         if(up.isEmpty()) {
             System.out.println(p);

             return ;
         }
         char ch = up.charAt(0);
         sub(ch+p , up.substring(1));
         sub(p , up.substring(1));

    }
    static ArrayList<String> subarr(String p , String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list ;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subarr(p+ch , up.substring(1));
        ArrayList<String> right = subarr(p , up.substring(1));
        left.addAll(right);
        Collections.sort(left); // to sort an arraylist
        return left ;
    }
    static void subAscii(String p , String up) {
        if(up.isEmpty()) {
            System.out.println(p);

            return ;
        }
        char ch = up.charAt(0);
        sub(ch+p , up.substring(1));
        sub(p , up.substring(1));
        sub(p + (ch+0) , up.substring(1));

    }



}
