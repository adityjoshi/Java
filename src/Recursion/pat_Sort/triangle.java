public class triangle {
    public static void main(String[] args) {
    pat(4 , 0);
    }

    static void pat(int r , int c) {
        if(r==0) {
            return;
        }
        if(c<r) {
            System.out.print(" * ");
            pat(r , ++c);
        } else {
            System.out.println();
            pat(--r , 0);
        }
    }
}