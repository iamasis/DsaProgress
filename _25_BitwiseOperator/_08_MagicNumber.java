package DsaProgress._25_BitwiseOperator;

import java.util.Scanner;

public class _08_MagicNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(findmagic(5));
    }
    static int findmagic(int a){
        int ans = 0;
        int base = 5;
        while(a >0){
            int last = a & 1;
            a = a >> 1;
            ans += last * base;
            base = base * 5;
        }
        return ans;
    }
}
