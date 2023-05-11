public class Main {
    public static void main(String[] args) {

        System.out.println(fact(5));
    }

 /*static int neg(int n ) {
        if(n==5) {
          return n  ;
        }
    System.out.println(n);
        return neg(n+1);
} */

    static int fact(int n ) {
    if(n <= 1 ) {
        return 1 ;
    }
    return n * fact(n-1);
}
}