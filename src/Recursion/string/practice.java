package Recursion.string;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
    int [] arr = {3,2,3,2,2,3,3};
        System.out.println(maj(arr));
    }
    static int maj(int [] arr ) {
    if(arr.length == 0 ) {
        return -1 ;
    }
        Arrays.sort(arr);
    int count = 0 ;
    int k =0 ;
    int max = 0 ;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]) {
                count++ ;
            } if (count > max) {
                max = count ;
                k = arr[i] ;
            } else {
                count = 0 ;
            }
        }
        return k ;
    }
}

// 0 1 3