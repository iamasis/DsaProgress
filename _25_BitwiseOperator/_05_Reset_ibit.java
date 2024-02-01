package DsaProgress._25_BitwiseOperator;

public class _05_Reset_ibit {
    public static void main(String[] args) {
        int num = 182;
        int ibit = 4;
        System.out.println(Integer.toBinaryString(num));
        int result = resetbit(num, ibit);
        System.out.println(Integer.toBinaryString(result));
    }
    static int resetbit(int num, int ibit){
        return num ^ (1 << (ibit-1));
    }
}

