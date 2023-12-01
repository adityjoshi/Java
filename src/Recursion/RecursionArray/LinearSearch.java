package Recursion.RecursionArray;
public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {3,2,4,5};
        int target =  0;
        System.out.println(find(arr , target , 0));
    }
    static boolean find(int [] arr , int target , int index) {
        // base condition
        if(index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr , target , index+1);
    }
}