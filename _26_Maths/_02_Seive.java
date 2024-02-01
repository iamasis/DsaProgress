package DsaProgress._26_Maths;

import java.util.ArrayList;

public class _02_Seive {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        seive(primes, n);
    }
    static void seive(boolean[] primes, int n){
        for (int i = 2; i <= n; i++) {
            if(!primes[i]){
                for(int j = i*2; j <= n; j += i){
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <= n ; i++) {
            if(!primes[i]){
                System.out.print(i + " ");
            }
        }
    }


}

