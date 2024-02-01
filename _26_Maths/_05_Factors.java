package DsaProgress._26_Maths;

import java.util.ArrayList;

public class _05_Factors {
    public static void main(String[] args) {
        int n = 40;
        factor1(n);
        System.out.println();
        factor2(n);
        System.out.println();
        factor3(n);
    }
    // O(n)
    static void factor1(int n){
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i +" ");
            }
        }
    }
    // O(sqrt(n))
    static void factor2(int n){
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if(n % i == 0){
                // we have two factors one is i and second one is n/i
                if(n/i == i){
                    // we use this because there may be a case where it prints i two times like in 36.
                    System.out.print(i +" ");
                }
                else{
                    System.out.print(i+" "+n/i+ " ");
                }
            }
        }
    }
    // here space and time complexity both will be O(sqrt(n)) because we creating new list
    static void factor3(int n){
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if(n % i == 0){
                // we have two factors one is i and second one is n/i
                if(n/i == i){
                    // we use this because there may be a case where it prints i two times like in 36.
                    System.out.print(i +" ");
                }
                else{
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size()-1; i>= 0; i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
