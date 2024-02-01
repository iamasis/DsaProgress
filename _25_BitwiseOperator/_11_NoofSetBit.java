package DsaProgress._25_BitwiseOperator;

public class _11_NoofSetBit {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setbit(n));
    }
    static int setbit(int n){
        int count = 0;
        while (n > 0){
            if((n & 1) == 1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
