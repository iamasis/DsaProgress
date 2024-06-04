package DsaProgress._25_BitwiseOperator;

public class _06_RightMostSetBit {
    public static void main(String[] args) {
        int num = 364;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toBinaryString(bit(num)));
    }
    static int bit(int num){
        return num & (-num);
    }

// -num means it will be compliment after first setbit.
}
