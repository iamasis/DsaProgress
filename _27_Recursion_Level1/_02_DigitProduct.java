package DsaProgress._27_Recursion_Level1;

import java.util.Scanner;

public class _02_DigitProduct {
    public static void main(String[] args) {

        System.out.println(product(513));
    }
    static int product(int n){
        if(n % 10 == n){
            return n;
        }
        return (n%10)*product(n/10);
    }
}
