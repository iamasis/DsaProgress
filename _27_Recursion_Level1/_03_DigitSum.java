package DsaProgress._27_Recursion_Level1;

public class _03_DigitSum {
    public static void main(String[] args) {
        int ans = sum(515);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n % 10 == n){
            return n;
        }
        return (n % 10)+(sum(n/10));
    }
}
