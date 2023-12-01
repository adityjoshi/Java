package Recursion.RecursionBasic;

public class recursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n) {
      // you have to print no till 5
      if(n == 5) {       // this is known as base condition where our Recursion.RecursionBasic.recursion will stop making new call's
          System.out.println(5);
        return;
      }
        System.out.println(n);
      print(n+1);
}
}
