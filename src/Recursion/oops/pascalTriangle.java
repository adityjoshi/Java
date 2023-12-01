/*
Write a Java program to display Pascal's triangle.
Test Data Input number of rows: 5 Expected Output:
Input number of rows: 5
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1

 */


package Recursion.oops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = in.nextInt();
        System.out.println(generate(row));
    }
     static List<List<Integer>> generate(int row) {
        if (row == 0)
        return new ArrayList<>();

     List<List<Integer>> ans = new ArrayList<>();
         for (int i = 0; i < row; i++) {
            List<Integer> rows = new ArrayList<>();
             for (int j = 0; j <= i; j++) {
                 if(j==0 || j==i){
                     rows.add(1) ;
                 } else {
                     rows.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
                 }
             }

             ans.add(rows);
         }
         return ans ;
    }
}


