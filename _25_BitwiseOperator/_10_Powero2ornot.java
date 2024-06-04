package DsaProgress._25_BitwiseOperator;

public class _10_Powero2ornot {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(Check(n));
    }
    static boolean Check(int n){
        return (n & (n-1)) == 0;
    }

}
