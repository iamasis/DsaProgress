package DsaProgress._27_Recursion_Level1;

public class _01_PrintNo {
    public static void main(String[] args) {
//        print(5);
//        System.out.println();
//        printrev(5);
//        System.out.println();
        printboth(5);
    }


    static void concept(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
//        concept(n--); this is infinite
        concept(--n);// to make finite
//        n-- vs --n
    }
    // print (n to 1)
    static void print(int n){
        if(n == 0){
            return;
        }
        System.out.print(n+" ");
        print(n-1);
    }
    // print (1 to n)
    static void printrev(int n){
        if(n == 0){
            return;
        }
        printrev(n-1);
        System.out.print(n +" ");
    }
    // print(n to 1 then 1 to n)
    static void printboth(int n){
        if(n == 0){
            return;
        }
        System.out.print(n+" ");
        printboth(n-1);
        System.out.print(n + " ");
    }
}
