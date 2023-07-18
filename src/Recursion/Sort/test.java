package Recursion.Sort;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4} ;
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    static boolean containsDuplicate(int[] nums) {
        boolean ans = false ;
        for (int i = 0 ; i<nums.length; i++) {
            for (int j = i+1 ; j < nums.length ; j++) {
                if(nums[i]==nums[j]) {
                    ans = true ;
                    break ;
                }
            }
        }
        return ans ;
    }

static int[] sortedSquares(int[] nums) {
    int n = nums.length ; // lenght of the new array
    int [] result  = new int[n]; // declaring a new array
// using two pointers one at start and one at end
// taking square of start and end and then comparing if
// start > end put start in the last of the array and increase the start pointer if end is greater decrease the end pointer
    int start = 0 ;
    int end  = n -1 ;
    int k = n-1 ; // to start filling the array from end
    while (start <= end ) {
        int startSq = nums[start] * nums[start] ;
        int endSq = nums[end] * nums[end] ;
        if(startSq > endSq) {
            result[k] = startSq ;
            start++ ;
        } else {
            result[k] = endSq ;
            end--;
        }
        k--;
    }
    return result ;
}
}
