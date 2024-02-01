package DsaProgress._25_BitwiseOperator;

public class _03_Find_ith_Bit {
    public static void main(String[] args) {
        int num = 182; // The number whose i-th bit you want to find
        System.out.println(Integer.toBinaryString(num));
        int ibit = 5;     // The position of the bit you want to find (1-based)
        System.out.println(Check(num, ibit));
    }
    static int Check(int num, int ibit){
        return (num & (1 << ibit)) != 0 ? 1 : 0;
        // tertiary condition is used here because if it result is 1 it will be with zeros.
        // then it get converted into 2's power.
    }
}
