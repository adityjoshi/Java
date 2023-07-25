package Recursion.string;

import java.util.Arrays;
import java.util.Scanner;

public class st {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = (in.nextLine());
        chString(s);
    }

    static void chString(String s) {
        int vowel = 0;
        int consonants = 0;
        int space = 0;
        s = s.toLowerCase();
        for (char i : s.toCharArray()) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                vowel++;
            } else if (i == ' ') {
                space++;
            } else {
                consonants++;
            }
        }
        System.out.println("vowels:" + vowel);
        System.out.println("consonants" + consonants);
        System.out.println("space" + space);
    }
}


