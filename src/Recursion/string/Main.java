package Recursion.string;

import java.util.Scanner;

class MyException extends Exception {
    public String toString() {
        return "Limit exceed";
    }

    public String getMessage() {
        return "You are wrong";
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = { 3, 5,7,9,0,3,6 };
        int maxRetries = 0;
        System.out.println("Enter index:");

        while (maxRetries < 5) {
            Scanner in = new Scanner(System.in);
           int index = in.nextInt();

            try {
                System.out.println(arr[index]);
                break;
            } catch (Exception e) {
                System.out.println(e);
                maxRetries++;
            }
        }

        if (maxRetries >= 5) {
            try {
                throw new MyException();
            } catch (Exception em) {
                System.out.println(em);
            }
        } //else {
          //  System.out.println("Valid index entered: " + index);
       // }
    }
}
