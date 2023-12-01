
package Recursion.RecursionArray;
public class SortedArray {

    public static void main(String[] args) {
    int [] arr = {1,2,4,6,5,7};
        System.out.println(chArr(arr , 0));
    }
    static boolean chArr (int [] arr , int index) {
        // base condition
        if(index == arr.length -1) {
            return true ;
        }
        return arr[index] < arr[index+1] && chArr(arr , index+1) ;
    }
}