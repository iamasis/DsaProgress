package DsaProgress._25_BitwiseOperator;

/*
when we xor 0 to a then
0 ^ 0 = 0
0 ^ 1 = 1
1 ^ 2 = 3
3 ^ 3 = 0
0 ^ 4 = 4                   a % 4 = 0   = a
5 ^ 4 = 1                   a % 4 = 1   = 1
6 ^ 1 = 7                   a % 4 = 2   = a+1
7 ^ 7 = 0                   a % 4 = 3   = 0
*/
public class _12_XorFromRange {
    public static void main(String[] args) {
        // range xor
        int a = 3;
        int b = 9;
        // xor(0 to b) - xor(o to a )
        int ans = xor(b) ^ xor(a-1);
        System.out.println(ans);

        // only for check (it will give time limit exceed)
        int ans2 = 0;
        for (int i = a; i <= b; i++) {
            ans2 ^= i;
        }

        System.out.println(ans2);
    }
    // xor 0 -> a
    static int xor(int n){
        if(n % 4 == 0){
            return n;
        }
        if(n % 4 == 1){
            return 1;
        }
        if(n % 4 == 2){
            return n+1;
        }
        return 0;
    }
}
