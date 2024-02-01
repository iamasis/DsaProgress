package DsaProgress._25_BitwiseOperator;

public class _04_Set_ithBit {
    public static void main(String[] args) {
        int num = 182;
        int ibit = 4;
        System.out.println(Integer.toBinaryString(num));
        int result = setbit(num, ibit);
        System.out.println(Integer.toBinaryString(result));
    }
    static int setbit(int num, int ibit){
        return num | (1 << (ibit-1));
    }
}
