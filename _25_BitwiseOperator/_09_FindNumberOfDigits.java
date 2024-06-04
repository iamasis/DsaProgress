package DsaProgress._25_BitwiseOperator;

public class _09_FindNumberOfDigits {
    public static void main(String[] args) {
        int n = 8;
        int base = 2;
        int ans = (int) (Math.log(n)/Math.log(base) + 1);
        System.out.println(Integer.toBinaryString(n));
        System.out.println(ans);
    }
}
