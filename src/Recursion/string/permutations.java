package Recursion.string;

import java.util.ArrayList;
import java.util.Collections;

public class permutations {
    public static void main(String[] args) {
        per("", "abc");
        System.out.println(perm("" , "abc"));
        System.out.println(perCount("" ,"abc"));
    }

    static void per(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            per(first + ch + second, up.substring(1));
        }
    }

    static ArrayList<String> perm(String p, String up) {
        if (up.isEmpty()) {
          ArrayList<String> list = new ArrayList<>();
          list.add(p);
          return list ;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            ans.addAll(perm(first + ch + second, up.substring(1)));
            Collections.sort(ans);
        }
        return ans ;
    }
    static int perCount(String p, String up) {
        if (up.isEmpty()) {
            //System.out.println(p);
            return 1  ;
        }
        int count = 0 ;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            count += perCount(first + ch + second, up.substring(1));
        }
        return count ;
    }

}