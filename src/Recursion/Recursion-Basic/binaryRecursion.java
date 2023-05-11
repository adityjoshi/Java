public class binaryRecursion {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 4;
        System.out.println(bin(arr , target , 0 , arr.length-1));
    }
    static int bin(int [] arr , int target , int s , int e ) {
        if(s>e) {
            return -1;
        }
        int m = s + (e-s)/2 ;
        if(arr[m] == target) {
            return m;
        }
        if(target < arr[m]) {
            return bin(arr , target ,s , m-1);
        }
        return bin(arr, target, m+1,e);
    }
}
