package Recursion.string;

import java.util.Scanner;

public class StrComplete {
    public static void main(String[] args) {
    String str = "ihi";
         int len = str.length();
        System.out.println(str.indexOf('i'));// to give index
        // .compare
        String str1 = "abc";
        String str2 = "bdc";
        System.out.println(str1.compareTo(str2));
        //if str1 == str2 ans => 0
        //if str1 > str2 ans => +ve  it checked on the basis of ascii value
        //if str1 < str2 ans => -ve

        // .contains => to check if the input given is present in the string
        String st = "hello" ;
        System.out.println(st.contains("llo"));
        // .startsWith to check weather the char present at the start is same as the input
        System.out.println(st.startsWith("hel"));

        // toLowerCase , toUpperCase , concact()
        System.out.println(st.toUpperCase());
        System.out.println(str1.concat(str2));

        // substring(i,j) , substring(i)
        String z = "adidas";
        System.out.println(z.substring(0,3));
// first index is 0 which is included and the last index is 3 which is excluded it will only show element till last-1
   String te = "physics";
        for (int i = 1; i < 4; i++) {
            System.out.println(te.substring(i));
        }
        String s = "abcd";
        for (int i = 0; i <= 3; i++) {
            for (int j = i+1; j<=4; j++) {
                System.out.println(s.substring(i,j) + " ");
            }
        }
        Scanner in = new Scanner(System.in);
        String x1 = in.nextLine();
        String x2 = "i am from well sophisticated family but that's a different story";
        if (x1.equals(x2)) {
            System.out.println("pallu ki jai ho");
        } else {
            System.out.println("if you are going to restaurant u will either buy a beverage or a meal");
        }

        // STRING BUILDER

        StringBuilder sad1 = new StringBuilder("hi");
        sad1.append(" adi"); // to add something
        System.out.println(sad1);
        sad1.setCharAt(0,'a'); // in string builder you can change char in as string
        System.out.println(sad1);
        //to insert in middle str.insert
        sad1.insert(1,'p');
        System.out.println(sad1);
        // to delete a char str.deleteCharAt
        StringBuilder sa = new StringBuilder("ayi");
        sa.deleteCharAt(1);
        System.out.println(sa);
        // to reverse a string
        System.out.println(sa.reverse());
        // to delete multiple char in string (x,y) x will be included and element before y will be included
        StringBuilder x = new StringBuilder("maths");
        System.out.println(x.delete(1,4));
        // question convert upper case letter to lower case and vice versa
        
    }
}
